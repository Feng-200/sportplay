package com.feng.sportplay.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 用户实体
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class User {

    @TableId(type = IdType.AUTO)
    private int id;
    private String username;    //用户名
    private String password;    //密码
    private String email;   //邮箱
    private String role;    //角色
    private boolean state;  //状态

}
