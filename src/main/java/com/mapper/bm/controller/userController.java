package com.mapper.bm.controller;

import com.mapper.bm.enery.User;
import com.mapper.bm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class userController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserByid/{id}")
    @ResponseBody
    public User getUserByid(@PathVariable int id){
        System.out.println("111");
        return userService.getUserById(id);
    }

}
