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

/**
 * 自定义Realm
 */
public class ManagerRealm extends AuthorizingRealm {
    @Autowired
    ManagerService managerService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 得到账号
        String principal = (String) token.getPrincipal();
        // 根据电话号(账号)查询数据库
        Manager manager = managerService.getManagerByPhone(principal);
        // 如果找到了
        if (!ObjectUtils.isEmpty(manager)){
            // 获取加密盐
            String salt = manager.getSalt();
            // 获取密码
            String password = manager.getPassword();
            // 返回匹配到的认证信息
            return new SimpleAuthenticationInfo(principal, password, ByteSource.Util.bytes(salt), this.getName());
        }
        // 没找到返回null
        return null;
    }
}
