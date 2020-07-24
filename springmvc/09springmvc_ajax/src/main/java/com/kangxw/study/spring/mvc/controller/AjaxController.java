package com.kangxw.study.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * {@code AjaxController} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-24 13:01
 */
@Controller
public class AjaxController {

    @RequestMapping("/ajax")
    public void ajax(String name, HttpServletResponse resp) throws IOException {
        if ("siggy".equals(name)) {
            resp.getWriter().print("true");
        } else {
            resp.getWriter().print("false");
        }
    }
}
