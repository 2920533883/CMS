package com.itzhang.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: CMS
 * @description: 客户实体类
 * @author: zhang rui feng
 * @create: 2020-07-18 17:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cus {
    int id;
    String name, company, position, salary, phone, createTime;
    int sex, state, empId;
}
