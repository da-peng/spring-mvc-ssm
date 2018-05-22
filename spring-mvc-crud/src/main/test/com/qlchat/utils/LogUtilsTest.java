package com.qlchat.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.utils
 * @Description: todo
 * @date 5/22/186:48 PM
 */
public class LogUtilsTest {

    @Test
    public void getBussinessLogger() {
        LogUtils.getBussinessLogger().error("Bussiness！！");
    }

    @Test
    public void getPlatformLogger() {
        LogUtils.getPlatformLogger().info("Platform！！");
    }

    @Test
    public void getDBLogger() {
        LogUtils.getDBLogger().info("DB！！");
    }

    @Test
    public void getExceptionLogger() {
        LogUtils.getExceptionLogger().info("Exception！！");
    }
}