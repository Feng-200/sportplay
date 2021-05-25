package com.feng.sportplay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Feng
 * @date 2021/5/12 21:34
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String  test(){
        System.out.println("111");
        return "OK";
    }
}
