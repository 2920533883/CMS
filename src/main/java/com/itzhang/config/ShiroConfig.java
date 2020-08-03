package com.itzhang.config;

import com.itzhang.shiro.ManagerRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;

/**
 * shiro配置类
 */
@Configuration
public class ShiroConfig{

    /**
     * 获取shiro拦截器的工厂实类
     * @param securityManager
     * @return shiro拦截器的工厂实类
     */
    @Bean(name = "shiroFilterFactoryBean")
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 存储需要被拦截的资源的map
        Map<String, String> map = new HashMap<>();
        map.put("/user/**", "authc");
        map.put("/manager/**", "authc");
        map.put("/books/**", "authc");
        map.put("/tag/**", "authc");
        map.put("/messageBoard/**", "authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        // 设置登录页
        shiroFilterFactoryBean.setLoginUrl("/login");
        // 设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        return shiroFilterFactoryBean;
    }

    /**
     * 获取自定义web安全管理器
     * @param realm
     * @return 自定义安全管理器
     */
    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(Realm realm){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        // 设置realm
        defaultWebSecurityManager.setRealm(realm);
        return defaultWebSecurityManager;
    }

    /**
     * 获取自定义realm
     * @return
     */
    @Bean
    public Realm getRealm(){
        ManagerRealm managerRealm = new ManagerRealm();
        // 创建凭证匹配器
        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
        // 设置加密方式
        credentialsMatcher.setHashAlgorithmName("MD5");
        // 设置盐
        credentialsMatcher.setHashIterations(1024);
        // 设置凭证匹配器
        managerRealm.setCredentialsMatcher(credentialsMatcher);
        return managerRealm;
    }
}
