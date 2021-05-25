package com.feng.sportplay.service.impl;

import com.feng.sportplay.bean.QueryInfo;
import com.feng.sportplay.bean.User;
import com.feng.sportplay.dao.UserDao;
import com.feng.sportplay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Feng
 * @date 2021/5/16 21:39
 */
@Service
public class UseServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByMassage(User user) throws Exception {
        return userDao.getUserByMassage(user.getUsername(), user.getPassword());
    }

    @Override
    public int getUserCounts(QueryInfo queryInfo) {
        return userDao.getUserCounts("%" + queryInfo.getQuery() + "%");
    }

    @Override
    public List<User> getAllUser(QueryInfo queryInfo) {
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();
        return userDao.getAllUser("%" + queryInfo.getQuery() + "%", pageStart, queryInfo.getPageSize());
    }

    @Override
    public int updateState(Integer id, Boolean state) {
        return userDao.updateState(id,state);
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return userDao.deleteUser(id);
    }

    @Override
    public User getUpdateUser(Integer id) {
        return userDao.getUpdateUser(id);
    }

    @Override
    public int editUser(User user) {
        return userDao.editUser(user);
    }
}
