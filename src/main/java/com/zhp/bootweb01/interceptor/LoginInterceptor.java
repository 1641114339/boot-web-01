package com.zhp.bootweb01.interceptor;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        StringBuffer requestURL = request.getRequestURL();
        log.info("拦截的路径:"+requestURL);
        HttpSession session = request.getSession();

        Object loginuser = session.getAttribute("loginuser");
        if (loginuser!=null){
            return true;
        }else {
            request.setAttribute("msg","请重新登录");
//            session.setAttribute("msg","请重新登录");
//            response.sendRedirect("/login");
            request.getRequestDispatcher("/").forward(request,response);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
