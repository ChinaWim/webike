package com.webike.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 登陆拦截器
 * Created by 542585138 on 2018/2/8.
 */
public class LoginInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //判断请求的地址 如果是 /admin/login 或 /admin/logout 就放行
        String requestURI = httpServletRequest.getRequestURI();
        String contextPath = httpServletRequest.getContextPath();
        if(requestURI.equals(contextPath+"/admin/login") || requestURI.equals(contextPath+"/admin/logout") )
            return true;


        HttpSession session = httpServletRequest.getSession();
        if(session.getAttribute("admin") == null){
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/login.jsp");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
