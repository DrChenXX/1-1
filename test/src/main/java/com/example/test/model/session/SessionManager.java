package com.example.test.model.session;

import org.springframework.stereotype.Component;

import java.util.HashMap;

// 会话对象管理器
/*
用于储存当前的用户会话。
 */
@Component
public class SessionManager {
    // 会话列表
    private HashMap<String,SessionHandler> sessionList;
    // 最大用户数量
    private int maxUser = 1000;
    // 会话保存时间(分钟）
    private long saveTime = 1000;

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
        long time = System.currentTimeMillis()/1000/60;
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
    public void killSession() {

    }

    // 消除目标会话
    public void killSession(String token) {
        sessionList.remove(token);
    }

}
