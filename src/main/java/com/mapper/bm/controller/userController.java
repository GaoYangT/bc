package com.mapper.bm.controller;

import com.mapper.bm.enery.User;
import com.mapper.bm.service.UserService;
import com.mapper.bm.util.ResHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class userController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserByid")
    @ResponseBody
    public String getUserByid(@RequestParam int id){
        User user = userService.getUserById(id);
        List list = ResHandler.ConvertObjToMap(user);
        return userService.getUserById(id).toString();
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public Map<String,Object> selectAll(){
        List list = userService.selectAll();
        Map<String,Object> map = new HashMap<>();
        map.put("resList",list);
        return map;
    }


}
