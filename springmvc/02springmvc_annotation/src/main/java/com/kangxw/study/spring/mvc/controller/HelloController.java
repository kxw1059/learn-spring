package com.kangxw.study.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    public ModelAndView hello(HttpServletRequest request, HttpServletResponse response)  {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Hello Spring MVC");
        mv.setViewName("hello");
        return mv;
    }
}
