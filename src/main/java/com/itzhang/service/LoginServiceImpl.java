package com.itzhang.service;

import com.itzhang.mapper.ManagerMapper;
import com.itzhang.pojo.Manager;
import com.itzhang.utils.SaltUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录服务接口实现类
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService{
    @Autowired
    ManagerMapper managerMapper;

    /**
     * 管理员注册， 密码通过MD5+Salt+Hash加密
     * @param manager 注册的管理员信息
     */
    @Override
    public void doRegister(Manager manager) {
        String password = manager.getPassword();
        // 通过自定义生成盐工具获取8位盐
        String salt = SaltUtils.getSalt(8);
        manager.setSalt(salt);
        // 对密码进行MD5hash加密， 散列1024次
        Md5Hash md5Hash = new Md5Hash(password, salt, 1024);
        // 设计加密后的密码
        manager.setPassword(md5Hash.toHex());
        // 插入数据库
        managerMapper.addManager(manager);
    }

    /**
     * 登录， 通过shiro认证
     * @param phone 手机号/账号
     * @param password 密码
     */
    @Override
    public void doLogin(String phone, String password) {
        // 获取主体
        Subject subject = SecurityUtils.getSubject();
        // 登录认证
        subject.login(new UsernamePasswordToken(phone, password));
    }
}
