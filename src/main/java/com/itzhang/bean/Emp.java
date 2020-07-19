package com.itzhang.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: CMS
 * @description: 员工实体类
 * @author: zhang rui feng
 * @create: 2020-07-18 08:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    int id;
    String username, password, realName;
    int role, state;
    String img, createTime;
}
