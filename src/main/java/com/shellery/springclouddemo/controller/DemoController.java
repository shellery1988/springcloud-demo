package com.shellery.springclouddemo.controller;

import com.shellery.springclouddemo.dto.ConfigDemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @Resource
    private ConfigDemo configDemo;

    @GetMapping("/hello")
    public String hello(){
        return "^_^ Hello!~ I am Shellery! \nThis is my first SpringCloud Project! Thank you!\n ";
    }

    @GetMapping("/appConfig")
    public String config(){
        return configDemo.getAppName();
    }

}
