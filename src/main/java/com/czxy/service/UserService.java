package com.czxy.service;

import com.czxy.dao.UserMapper;
import com.czxy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhangjian1
 * @version 1.3
 * @Date 2019/10/18
 * @since 1.2
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public List<User> getAll() {
        return userMapper.selectAll();
    }

    public User getById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public void updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    public void deleteUser(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }
}
