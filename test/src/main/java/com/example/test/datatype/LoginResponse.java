package com.example.test.datatype;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponse {
    private String token;
    @JsonProperty("userRole")
    private String userRole;

    public LoginResponse() {
    }

    public LoginResponse(String token, String userRole) {
        this.token = token;
        this.userRole = userRole;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("userRole")
    public String getUserRole() {
        return userRole;
    }

    @JsonProperty("userRole")
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
