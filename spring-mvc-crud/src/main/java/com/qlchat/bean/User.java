package com.qlchat.bean;

import org.springframework.stereotype.Component;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.dto
 * @Description: todo
 * @date 5/23/1811:17 PM
 */
@Component
public class User {
    private String username="";
    private String password="";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
