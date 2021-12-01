package com.wasu.springmvc.interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    Logger logger;

    public MyInterceptor() {
        logger = LogManager.getLogger();
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("执行MyInterceptor ------ preHandle() ---");
        Object object = request.getSession().getAttribute("username");
        if(object==null) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            return false;
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("执行MyInterceptor ------ postHandle() ---");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("执行MyInterceptor ------ afterCompletion() ---");
    }
}
