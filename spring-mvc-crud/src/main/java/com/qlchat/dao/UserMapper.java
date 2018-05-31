package com.qlchat.dao;

import com.qlchat.bean.User;

import java.util.List;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.dao
 * @Description: 这种才符合Mybatis Mapper接口命名规则
 * @date 5/30/186:11 PM
 */
public interface UserMapper {
    /**
     * 根据主健查询/根据用户id，获取用户登陆验证信息
     * @param id
     * @return
     */
    User selectByUserId(long id);

    List<User> listAllUser();

    void batchSaveUser(List<User> list);

    int updateUser(User user);
}
