package com.itzhang.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: CMS
 * @description: 登录拦截器
 * @author: zhang rui feng
 * @create: 2020-07-19 16:52
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("user");
        if (user == null){
            request.getRequestDispatcher("/").forward(request, response);
            return false;
        }
        return true;
    }
}
