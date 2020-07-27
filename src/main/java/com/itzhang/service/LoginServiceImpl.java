package com.itzhang.service;

import com.itzhang.mapper.ManagerMapper;
import com.itzhang.pojo.Manager;
import com.itzhang.utils.SaltUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService{
    @Autowired
    ManagerMapper managerMapper;
    @Override
    public void doRegister(Manager manager) {
        String password = manager.getPassword();
        String salt = SaltUtils.getSalt(8);
        manager.setSalt(salt);
        Md5Hash md5Hash = new Md5Hash(password, salt, 1024);
        manager.setPassword(md5Hash.toHex());
        managerMapper.addManager(manager);
    }

    @Override
    public void doLogin(String phone, String password) {
        Subject subject = SecurityUtils.getSubject();
        subject.login(new UsernamePasswordToken(phone, password));
    }
}
