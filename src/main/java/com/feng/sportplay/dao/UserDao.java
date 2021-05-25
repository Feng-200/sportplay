package com.feng.sportplay.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.feng.sportplay.bean.User;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Feng
 * @date 2021/5/16 20:31
 */

@Repository
public interface UserDao{

    public User getUserByMassage(@Param("username") String username, @Param("password") String password);

    public List<User> getAllUser(@Param("username") String username, @Param("pageStart") int pageStart, @Param("pageSize") int pageSize);

    public int getUserCounts(@Param("username") String username);

    public int updateState(Integer id, Boolean state);

    public int addUser(User user);

    public int deleteUser(int id);

    public User getUpdateUser(int id);

    public int editUser(User user);

}
