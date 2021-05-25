package com.feng.sportplay.service.impl;

import com.feng.sportplay.bean.MainMenu;
import com.feng.sportplay.dao.MenuDao;
import com.feng.sportplay.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Feng
 * @date 2021/5/17 21:27
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public List<MainMenu> getMainMenus() {
        return menuDao.getMainMenus();
    }
}
