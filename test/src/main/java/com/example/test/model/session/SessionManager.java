package com.example.test.model.session;

import com.example.test.EnvironmentConfig;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

// 会话对象管理器
/*
用于储存当前的用户会话。
 */
@Component
@EnableScheduling
public class SessionManager {
    // 会话列表
    private HashMap<String,SessionHandler> sessionList;
    // 最大用户数量
    private int maxUser = EnvironmentConfig.maxUser;
    // 会话保存时间(分钟）
    private long saveTime = EnvironmentConfig.saveTime;

    public SessionManager() {
        sessionList = new HashMap<String,SessionHandler>();
    }

    public SessionManager(HashMap<String, SessionHandler> sessionList, int maxUser) {
        this.sessionList = sessionList;
        this.maxUser = maxUser;
    }

    public HashMap<String, SessionHandler> getSessionList() {
        return sessionList;
    }

    public void setSessionList(HashMap<String, SessionHandler> sessionList) {
        this.sessionList = sessionList;
    }

    public int getMaxUser() {
        return maxUser;
    }

    public void setMaxUser(int maxUser) {
        this.maxUser = maxUser;
    }

    // 新建用户会话
    public void addSession(String token, String userid, String userRole) {
        long time = System.currentTimeMillis();
        SessionHandler sessionHandler = new SessionHandler(token, userid, userRole, time);
        sessionList.put(token,sessionHandler);
    }

    // 查找会话是否存在
    public boolean checkSession(String token) {
        return sessionList.containsKey(token);
    }

    // 获取用户会话
    public SessionHandler getSession(String token) {

        return sessionList.get(token);
    }

    // 消除已过期会话
    @Scheduled(cron = "0 0 1 * * ?")
    public void killSession() {
        System.out.println("正在自动清理过期会话");
        for(Map.Entry<String,SessionHandler> entry : sessionList.entrySet()) {
            long timeOfUse = System.currentTimeMillis() - entry.getValue().getTime();
            if (timeOfUse >= saveTime) {
                killSession(entry.getKey());
                System.out.println("id为"+entry.getValue().getUserid()+"的会话对象已被清理");
            }
        }
        System.out.println("所有过期会话已被清理");
    }

    // 消除目标会话
    public void killSession(String token) {
        sessionList.remove(token);
    }

}
