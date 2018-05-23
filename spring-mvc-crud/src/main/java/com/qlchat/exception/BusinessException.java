package com.qlchat.exception;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.base
 * @Description: todo
 * @date 5/23/184:30 PM
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private int code;
    private String msg;


    public BusinessException(ErrorCode errorType) {
        this.code = errorType.getCode();
        this.msg = errorType.getMsg();
    }

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
