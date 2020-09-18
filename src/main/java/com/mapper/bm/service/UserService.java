package com.mapper.bm.service;

import com.mapper.bm.enery.User;
import com.mapper.bm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(int id){
        return userMapper.selectByPrimaryKey(id);
    }

    public List selectAll(){
        return userMapper.selectAll();
    }
}
