package com.Jiang.intercept;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheck implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getSession().getAttribute("Login")!=null){
            return true;
        }
        //重定向到登录页!
        response.sendRedirect(request.getContextPath());
        //请求转发到登录页
//        request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request,response);
        return false;
//        return true;
    }
}
