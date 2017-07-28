package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/index")
    public String index(){
        return "hello world";
    }

    @RequestMapping("/login")
    public String login(){
        return "linda dada";
    }
}
