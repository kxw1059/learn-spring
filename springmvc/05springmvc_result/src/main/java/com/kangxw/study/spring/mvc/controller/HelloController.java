package com.kangxw.study.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * {@code HelloController} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-23 15:57
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //response.getWriter().println("hello spring mvc use HttpServlet api");
        // 实现重定向
        // response.sendRedirect("index.jsp");
        // 实现转发
        request.setAttribute("msg", "servlet api forward");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @RequestMapping("/hello1")
    public String hello() {
        // 转发1
        // return "index.jsp";

        // 转发2
        // return "forward:index.jsp";

        // 重定向
        return "redirect:index.jsp";
    }

    @RequestMapping("hello2")
    public String hello2() {
        // 转发
        // return "hello";

        // 重定向
        return "redirect:hello.do";
    }
}
