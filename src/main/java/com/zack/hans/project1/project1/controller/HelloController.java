package com.zack.hans.project1.project1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() throws Exception {
        // throw new Exception("发生错误");
        return "Hello World";
    }

}
