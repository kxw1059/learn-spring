package com.kangxw.study.spring.mvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * {@code MyInterceptor} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-24 15:25
 */
public class LoginInterceptor implements HandlerInterceptor {

    private List<String> allowedPass;

    // 在请求处理的方法之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURL().toString();
        // 先判断 session 中是否有
        Object user = request.getSession().getAttribute("user");
        if (user != null) {
            return true;
        }
        for (String temp : allowedPass) {
            if (url.endsWith(temp)) {
                return true;
            }
        }
        response.sendRedirect(request.getContextPath() + "/login.jsp");
        return false;
    }
    // 在请求处理的方法之后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void setAllowedPass(List<String> allowedPass) {
        this.allowedPass = allowedPass;
    }
}
