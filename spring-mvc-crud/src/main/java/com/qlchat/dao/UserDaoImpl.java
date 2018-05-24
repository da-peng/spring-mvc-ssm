package com.qlchat.dao;

import com.qlchat.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.dao
 * @Description: todo
 * @date 5/24/1810:10 PM
 */
@Repository
public class UserDaoImpl implements UserDao {

    public User getUserById(Integer id) {
        return null;
    }

    public List<User> listAllUser() {
        return null;
    }

    public void batchSaveUser(List<User> list) {

    }

    public int updateUser(User user) {
        return 0;
    }
}
