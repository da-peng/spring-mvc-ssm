package com.qlchat.cache.template;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import javax.annotation.PostConstruct;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.cache
 * @Description: Hash操作
 * @date 5/24/182:34 PM
 */
public class HashRedisTemplate extends RedisTemplate<String,Object> {

    /**
     * 初始化
     */
    @PostConstruct
    public void init() {
        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
        this.setHashKeySerializer(jackson2JsonRedisSerializer);
        this.setHashValueSerializer(jackson2JsonRedisSerializer);
    }

    /**
     * 向Hash中添加值
     * @param key      可以对应数据库中的表名
     * @param field    可以对应数据库表中的唯一索引
     * @param value    存入redis中的值
     */
    public void hset(String key, String field, String value) {
        if(key == null || "".equals(key)){
            return ;
        }

        this.opsForHash().put(key, field, value);

    }

    /**
     * 从redis中取出值
     * @param key
     * @param field
     * @return
     */
    public String hget(String key, String field){
        if(key == null || "".equals(key)){
            return null;
        }
        return (String) this.opsForHash().get(key, field);
    }

    /**
     * 判断 是否存在 key 以及 hash field
     * @param key
     * @param field
     * @return
     */
    public boolean hexists(String key, String field){
        if(key == null || "".equals(key)){
            return false;
        }
        return this.opsForHash().hasKey(key, field);
    }

    /**
     * 查询 key中对应多少条数据
     * @param key
     * @return
     */
    public long hsize(String key) {
        if(key == null || "".equals(key)){
            return 0L;
        }
        return this.opsForHash().size(key);
    }

    /**
     * 删除
     * @param key
     * @param field
     */
    public void hdel(String key, String field) {
        if(key == null || "".equals(key)){
            return;
        }
        this.opsForHash().delete(key, field);
    }



}
