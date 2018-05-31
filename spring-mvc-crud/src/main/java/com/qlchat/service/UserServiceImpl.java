package com.qlchat.service;

import com.qlchat.bean.User;
import com.qlchat.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.service
 * @Description: 方法名上加入@Transactional，说明这个方法要启用事务。如果类名上加入@Transactional，则表明这个类中的所有方法都会启用事务。
 * @date 5/24/184:58 PM
 */
@Service("UserService")
//只能被应用到public方法上, 对于其它非public的方法,如果标记了@Transactional也不会报错,但方法没有事务功能.
@Transactional(readOnly = true)//否为只读事务 true表示只读，false表示不是，发生错误会回滚
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public User getUserById(long id){
        return userMapper.selectByUserId(id);
    }

    public List<User> listAllUser(){
        return userMapper.listAllUser();
    }
    //对于不是添加，修改，删除，设置readOnly = false，
    @Transactional(readOnly = false)//写
    public void batchSaveUser(List<User> list){
        userMapper.batchSaveUser(list);
    }
    @Transactional(readOnly = false)//写
    public int updateUser(User user){
        return userMapper.updateUser(user);
    }
}
