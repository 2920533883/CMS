package com.itzhang.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: CMS
 * @description: 自定义组件配置
 * @author: zhang rui feng
 * @create: 2020-07-19 16:55
 */
@Configuration
public class MyMVCConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**").excludePathPatterns("/login", "/", "/static/**");
    }
}
