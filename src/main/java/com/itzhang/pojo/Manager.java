package com.itzhang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 管理员类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {
    String id, name, phone, password, salt;
}
