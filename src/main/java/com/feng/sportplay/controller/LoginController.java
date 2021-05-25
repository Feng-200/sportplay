package com.feng.sportplay.controller;

import com.alibaba.fastjson.JSON;
import com.feng.sportplay.bean.User;
import com.feng.sportplay.dao.UserDao;
import com.feng.sportplay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author Feng
 * @date 2021/5/16 20:21
 */
@RestController
public class LoginController {

    @Autowired
    UserService userService;
    //UserDao userDao;

    @RequestMapping("/login")
    public String login(@RequestBody User user) throws Exception {
        String flag = "error";
        User us = userService.getUserByMassage(user);
        HashMap<String, Object> res = new HashMap<>();
        if (us != null) {
            flag = "OK";
        }
        res.put("flag", flag);
        res.put("user", us);
        String res_json = JSON.toJSONString(res);
        System.out.println("user:" + us);
        return res_json;
    }
}
