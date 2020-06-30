package com.mapper.bm.controller;

import com.mapper.bm.enery.User;
import com.mapper.bm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class userController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserByid")
    @ResponseBody
    public String getUserByid(@RequestParam int id){
        return userService.getUserById(id).toString();
    }

}
