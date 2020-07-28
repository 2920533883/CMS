package com.itzhang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 管理员类
 * id 序号
 * name 姓名
 * phone 电话号
 * password 密码
 * salt 加密盐
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {
    String id, name, phone, password, salt;
}
