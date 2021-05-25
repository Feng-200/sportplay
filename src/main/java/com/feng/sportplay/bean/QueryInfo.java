package com.feng.sportplay.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Feng
 * @date 2021/5/18 13:53
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class QueryInfo {
    private String query;//查询信息username
    private int pageNum=1;//当前页
    private int pageSize=1;//每页最大数
}
