package com.example.test.model.session;



import com.example.test.model.service.PrincipalService;
import com.example.test.model.service.TeacherService;
import com.example.test.tool.GetBeanTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// 会话对象
/*
目前的解决方案是，在用户登陆进来之后创建一个这样的对话对象，和用户当前的token相关联。
每次和回话交互会刷新会话中的time，并且在管理器中设置一个检测机制，当一个会话长时间没有被交互之后就进行销毁。下次用户访问需要重新登陆。
 */

public class SessionHandler {
    // 用户token
    private String token;
    // 用户名
    private String userid;
    // 用户类型：0-系统管理员；1-专业负责人；2-教师；3-游客
    private String userRole;
    // 回话创建时间，分钟级别
    private long time;


    private PrincipalService principalService = GetBeanTool.getBean(PrincipalService.class);

    private TeacherService teacherService = GetBeanTool.getBean(TeacherService.class);

    public SessionHandler() {
    }

    public SessionHandler(String token, String userid, String userRole, long time) {
        this.token = token;
        this.userid = userid;
        this.userRole = userRole;
        this.time = time;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public PrincipalService getPrincipalService() {
        return principalService;
    }

    public void setPrincipalService(PrincipalService principalService) {
        this.principalService = principalService;
    }

    public TeacherService getTeacherService() {
        return teacherService;
    }

    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
}
