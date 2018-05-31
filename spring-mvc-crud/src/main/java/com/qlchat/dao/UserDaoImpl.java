package com.qlchat.dao;

import com.qlchat.bean.UserInfo;
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

    public UserInfo getUserById(Integer id) {
        return null;
    }

    public List<UserInfo> listAllUser() {
        return null;
    }

    public void batchSaveUser(List<UserInfo> list) {

    }

    public int updateUser(UserInfo user) {
        return 0;
    }
}
