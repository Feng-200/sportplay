package com.feng.sportplay.dao;

import com.feng.sportplay.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Feng
 * @date 2021/5/17 21:05
 */
@Repository
public interface MenuDao {
    public List<MainMenu> getMainMenus();
}
