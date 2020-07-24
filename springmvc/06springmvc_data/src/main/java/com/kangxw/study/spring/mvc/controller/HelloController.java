package com.kangxw.study.spring.mvc.controller;

import com.kangxw.study.spring.mvc.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    public HelloController() {
        System.out.println("hello constructor");
    }

    @RequestMapping("/hello")
    public String hello(String name, ModelMap model) {
        System.out.println(name);
        model.addAttribute("msg", name);
        return "index.jsp";
    }

    @RequestMapping("/hello1")
    public String hello1(@RequestParam("uname") String name) {
        System.out.println(name);
        return "index.jsp";
    }

    @RequestMapping("/user")
    public String user(User user) {
        System.out.println(user);
        return "index.jsp";
    }
}
