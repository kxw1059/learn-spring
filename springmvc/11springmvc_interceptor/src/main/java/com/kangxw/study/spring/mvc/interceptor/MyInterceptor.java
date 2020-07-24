package com.kangxw.study.spring.mvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * {@code MyInterceptor} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-24 15:25
 */
public class MyInterceptor implements HandlerInterceptor {
    // 在请求处理的方法之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("-------------处理前-------------");
        // 拦截重定向或转发
        response.sendRedirect(request.getContextPath());
        return false;
    }
    // 在请求处理的方法之后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("-------------处理后-------------");

    }

    // 在DispatchServlet处理后执行 -------- 清理工作
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
