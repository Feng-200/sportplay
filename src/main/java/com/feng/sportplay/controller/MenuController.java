package com.feng.sportplay.controller;

import com.alibaba.fastjson.JSON;
import com.feng.sportplay.bean.MainMenu;
import com.feng.sportplay.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author Feng
 * @date 2021/5/17 22:06
 */
@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("/menus")
    public String getAllMenus() {

        System.out.println("成功访问！！！");
        HashMap<String, Object> data = new HashMap<>();
        List<MainMenu> mainMenus = menuService.getMainMenus();
        if (mainMenus != null) {
            data.put("data", mainMenus);
            data.put("status", 200);
        } else {
            data.put("status", 404);
        }
        String data_json = JSON.toJSONString(data);
        return data_json;
    }
}
