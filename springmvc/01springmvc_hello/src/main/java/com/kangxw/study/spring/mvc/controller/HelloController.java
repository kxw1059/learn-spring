package com.kangxw.study.spring.mvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * {@code HelloController} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-23 15:57
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Hello Spring MVC");
        mv.setViewName("hello");
        return mv;
    }
}
