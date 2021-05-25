package com.feng.sportplay.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *分支导航
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class SubMenu {

    @TableId(type = IdType.AUTO)
    private int id;
    private String title;
    private String path;
}
