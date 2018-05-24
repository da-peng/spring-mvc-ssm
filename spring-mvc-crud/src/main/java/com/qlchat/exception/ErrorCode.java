package com.qlchat.exception;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.base
 * @Description: 错误代码枚举类
 * @date 5/23/184:30 PM
 */
public enum ErrorCode {

    SIGN_PARAM_ERROR(101,"没有权限！"),WRONG_PARAMS(102,"参数错误！");

    private int code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;


    private ErrorCode(int code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
