package com.itzhang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户实体类
 * id 序号
 * role_id 权限id 普通用户为0  VIP为1
 * status 是否认证 0否 1是
 * name 用户昵称
 * password 密码
 * phone 电话号码(账号)
 * salt 加密盐
 * create_time 注册时间
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    int id, role_id, status;
    String name, password, phone, salt, create_time;
}
