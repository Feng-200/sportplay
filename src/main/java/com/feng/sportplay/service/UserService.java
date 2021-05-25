package com.feng.sportplay.service;

import com.feng.sportplay.bean.QueryInfo;
import com.feng.sportplay.bean.User;

import java.util.List;

/**
 * @author Feng
 * @date 2021/5/16 21:39
 */
public interface UserService {

    public User getUserByMassage(User user) throws Exception;

    public int getUserCounts(QueryInfo queryInfo);

    public List<User> getAllUser(QueryInfo queryInfo);

    public int updateState(Integer id, Boolean state);

    public int addUser(User user);

    public int deleteUser(Integer id);

    public User getUpdateUser(Integer id);

    public int editUser(User user);
}
