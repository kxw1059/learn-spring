package com.kangxw.study.spring.mvc.controller;

import com.kangxw.study.spring.mvc.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * {@code HelloController} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-23 15:57
 */
@Controller
public class UserController {

    @RequestMapping("/login")
    public String login(User user, HttpSession session) {
        if ("kangxw".equals(user.getName()) && "1111".equals(user.getPwd())) {
            session.setAttribute("user", user);
            return "redirect:/index.jsp";
        }
        return "redirect:/login.jsp";
    }

    @RequestMapping("/add")
    public String add() {
        System.out.println("add");
        return "redirect:/login.jsp";
    }
}
