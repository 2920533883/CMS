package com.itzhang.service.Impl;

import com.itzhang.bean.Emp;
import com.itzhang.mapper.ChangeItemMapper;
import com.itzhang.service.ChangeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: CMS
 * @description: 更改密码服务实现类
 * @author: zhang rui feng
 * @create: 2020-07-19 15:04
 */
@Service("changePassService")
public class ChangeItemItemServiceImpl implements ChangeItemService {
    @Autowired
    ChangeItemMapper changePassMapper;
    @Override
    public String checkPassword(String username) {
        return changePassMapper.checkPassword(username);
    }

    @Override
    public void changePassword(String username, String newPass) {
        changePassMapper.changePassword(username, newPass);
    }

    @Override
    public void updateInfo(String username, String realName, String img, int id) {
        changePassMapper.updateInfo(username, realName, img, id);
    }

    @Override
    public Emp getUserInfo(int id) {
        return changePassMapper.getUserInfo(id);
    }


}
