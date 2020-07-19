package com.itzhang.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: CMS
 * @description: 更改密码服务接口
 * @author: zhang rui feng
 * @create: 2020-07-19 15:03
 */

public interface ChangeItemService {
    public String checkPassword(String username);
    public int changePassword(String username, String newPass);
}
