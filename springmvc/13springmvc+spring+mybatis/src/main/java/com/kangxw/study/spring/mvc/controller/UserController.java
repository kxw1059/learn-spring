package com.kangxw.study.spring.mvc.controller;

import com.kangxw.study.spring.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * {@code UserController} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-24 16:52
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("list", userService.list());
        return "list.jsp";
    }
}
