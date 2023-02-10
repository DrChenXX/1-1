package com.example.test.tool;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.test.EnvironmentConfig;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@Component
public class TokenTool {
    /*
    token格式：
    userid:用户id
    userRole:用户角色，0系统管理员 1专业负责人 2老师 3游客
     */


    private String key = EnvironmentConfig.key;

    // 加密token
    public String getToken(String userid, String userRole) {

        String token = JWT
                .create()
                .withClaim("userid",userid)
                .withClaim("userRole",userRole)
                .withClaim("timeStamp",System.currentTimeMillis())
                .sign(Algorithm.HMAC256(key));

        return token;
    }

    // 解析token
    public Map<String,String> parseToken(String token) {
        HashMap<String,String> map = new HashMap<>();
        DecodedJWT decodedJWT = JWT.require(Algorithm.HMAC256(key))
                .build().verify(token);
        Claim userid = decodedJWT.getClaim("userid");
        Claim userRole = decodedJWT.getClaim("userRole");
        Claim timeStamp = decodedJWT.getClaim("timeStamp");
        map.put("userid",userid.asString());
        map.put("userRole",userRole.asString());
        map.put("timeStamp",timeStamp.asLong().toString());
        return map;
    }
}
