package com.itzhang.service;

import com.itzhang.bean.Emp;

/**
 * @program: CMS
 * @description: 更改密码服务接口
 * @author: zhang rui feng
 * @create: 2020-07-19 15:03
 */

public interface ChangeItemService {
    public String checkPassword(String username);
    public void changePassword(String username, String newPass);
    public void updateInfo(String username, String realName, String img, int id);
    public Emp getUserInfo(int id);
}
