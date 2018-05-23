package com.qlchat.controller;

import org.junit.Test;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.junit.Assert.*;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.controller
 * @Description: 基于rest-assured  对controller 层进行测试
 * @date 5/23/189:32 AM
 */
public class IndexControllerTest {
// https://github.com/rest-assured/rest-assured/wiki/Usage#spring-mock-mvc-module
    @Test
    public void index1() {
        given().
                standaloneSetup(new IndexController()).
                param("name","xh").  // 传入request param 参数
        when().
                get("/").
        then().
                statusCode(200);


    }

    @Test
    public void index2() {
        given().
                standaloneSetup(new IndexController()).
                param("name","xh").  // 传入request param 参数
                when().
                get("/").
                then().
                statusCode(100);


    }
}