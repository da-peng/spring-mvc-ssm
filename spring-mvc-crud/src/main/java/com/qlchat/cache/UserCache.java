package com.qlchat.cache;

import org.springframework.stereotype.Repository;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.cache
 * @Description: todo
 * @date 5/24/1811:17 PM
 */
@Repository
public class UserCache {

    public static final String USER_SESSION_ID = "USER_SESSION_ID_%s";

    public void setUserSessionId(int uid,String sessionId){

        String cacheKey=String.format(USER_SESSION_ID,uid);


    }
}
