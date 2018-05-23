package com.qlchat.dto;

import java.io.Serializable;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.dto
 * @Description: todo
 * @date 5/23/181:54 PM
 */
public class UserInfo implements Serializable {

    private  String nick;
    private  String email;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
