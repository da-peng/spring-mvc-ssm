package com.qlchat.cache.redis;

import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.cache
 * @Description: todo
 * @date 5/24/182:35 PM
 */
public class RedisConnectionFactory extends JedisConnectionFactory {
    private RedisStandaloneConfiguration standaloneConfig;

    @Override
    @SuppressWarnings("deprecation") //抑制警告，不检测过期的方法
    public void setHostName(String hostName) {
        super.setHostName(hostName);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void setPort(int port) {
        super.setPort(port);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void setPoolConfig(JedisPoolConfig poolConfig) {
        super.setPoolConfig(poolConfig);
    }
}

