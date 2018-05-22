package com.qlchat.utils;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.utils
 * @Description: 分为，业务，平台，错误，db，日志
 * @date 5/22/185:56 PM
 */
public enum LogEnum {

    BUSSINESS("bussiness"),

    PLATFORM("platform"),

    DB("db"),

    EXCEPTION("exception"),

    ;


    private String category;


    LogEnum(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
