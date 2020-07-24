package com.kangxw.study.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * {@code Hello2Controller} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-24 11:43
 */
@Controller
@RequestMapping("/hello2")
public class Hello2Controller {
    @RequestMapping(params = "method=add", method = RequestMethod.POST)
    public String add() {
        System.out.println("add");
        return "redirect:/index.jsp";
    }
    public String update() {
        System.out.println("update");
        return "redirect:/index.jsp";
    }
    public String delete() {
        System.out.println("delete");
        return "redirect:/index.jsp";
    }
}
