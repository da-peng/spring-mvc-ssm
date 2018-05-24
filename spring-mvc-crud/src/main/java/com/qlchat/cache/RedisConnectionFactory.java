package com.qlchat.cache;

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
    public void setHostName(String hostName) {
        super.setHostName(hostName);
    }

    @Override
    public void setPort(int port) {
        super.setPort(port);
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public void setPoolConfig(JedisPoolConfig poolConfig) {
        super.setPoolConfig(poolConfig);
    }
}

