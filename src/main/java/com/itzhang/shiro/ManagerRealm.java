package com.itzhang.shiro;

import com.itzhang.mapper.ManagerMapper;
import com.itzhang.pojo.Manager;
import com.itzhang.service.ManagerService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;


public class ManagerRealm extends AuthorizingRealm {
    @Autowired
    ManagerService managerService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String principal = (String) token.getPrincipal();
        Manager manager = managerService.getManagerByPhone(principal);
        if (!ObjectUtils.isEmpty(manager)){
            String salt = manager.getSalt();
            String password = manager.getPassword();
            return new SimpleAuthenticationInfo(principal, password, ByteSource.Util.bytes(salt), this.getName());
        }
        return null;
    }
}
