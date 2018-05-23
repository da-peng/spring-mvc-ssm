package com.qlchat.base;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.base
 * @Description: todo
 * @date 5/23/182:46 PM
 */
public abstract class BaseResponse {
    // 状态码
    private  int code;

    // 返回信息
    private  String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
