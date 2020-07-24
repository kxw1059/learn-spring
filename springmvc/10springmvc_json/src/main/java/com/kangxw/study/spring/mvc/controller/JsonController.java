package com.kangxw.study.spring.mvc.controller;

import com.kangxw.study.spring.mvc.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code AjaxController} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-24 13:01
 */
@Controller
public class JsonController {

    @RequestMapping("/json")
    @ResponseBody
    public List<User> json() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "zhangsan", "男"));
        list.add(new User(2, "nico", "female"));
        list.add(new User(3, "jackson", "男"));
        return list;
    }
}
