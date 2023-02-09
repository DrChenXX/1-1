package com.example.test.filter;


import com.example.test.exception.TokenExpiredException;
import com.example.test.exception.TokenIncorrectException;
import com.example.test.model.dao.logic.YonghuMgr;
import com.example.test.model.session.SessionManager;
import com.example.test.tool.TokenTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component
public class TokenInterceptor implements HandlerInterceptor {
    // 检测token的filter

    // jwt工具
    @Autowired
    private TokenTool tokenTool;
    // key
    private String key = "hidakleihcilllseafgjieiloner121";
    // 过期时间
    private Long oldToken = 3000000000L;

    // 用户数据库
    @Autowired
    private YonghuMgr yonghuMgr;
    // 会话管理器
    @Autowired
    private SessionManager sessionManager;


    // 拦截操作
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
        //为空就返回错误
        String token = httpServletRequest.getHeader("token");
        if (null == token || "".equals(token.trim())) {
            throw new TokenIncorrectException();
        }

        Map<String, String> map = tokenTool.parseToken(token);
        String userId = map.get("userId");
        String userRole = map.get("userRole");
        long timeOfUse = System.currentTimeMillis() - Long.parseLong(map.get("timeStamp"));
        //1.判断 token 是否匹配
        String userToken = yonghuMgr.getByID(userId).getToken();
        if (token == userToken) {
            // token正确
            //2.判断是否过期
            if(timeOfUse>=oldToken) {
                throw new TokenExpiredException();
            } else {
                if (!sessionManager.checkSession(token)) {
                    // 如果会话管理器中没有对应的会话，则创建一个
                    sessionManager.addSession(token,userToken,userRole);
                }
                return true;
            }
        } else {
            // token错误
            throw new TokenIncorrectException();
        }
    }

}
