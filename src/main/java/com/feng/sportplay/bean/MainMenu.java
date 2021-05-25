package com.feng.sportplay.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * 主导航
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class MainMenu {

    @TableId(type = IdType.AUTO)
    private int id;
    private String title;
    private String path;
    List<SubMenu> slist;
}
