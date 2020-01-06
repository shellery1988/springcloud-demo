package com.shellery.springclouddemo.controller;

import com.shellery.springclouddemo.dto.ConfigDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @Autowired
    private ConfigDemo configDemo;

    @GetMapping("/hello")
    public String hello(){
        return "^_^ Hello!~ I am Shellery! \nThis is my first SpringCloud Project! Thank you!\n ";
    }

    @GetMapping("/appConfig")
    public String config(){
        return configDemo.getAppName();
//        Config config = ConfigService.getAppConfig();
//        Set<String> fieldsNames = config.getPropertyNames();
//        for(String fieldsName : fieldsNames){
//            String attributeName=fieldsName;
//            String attributeValue = config.getProperty(fieldsName,"");
//            System.out.println("attributeName:"+attributeName + "; attributeValue:" + attributeValue );
//        }
//        return "success!";
    }

}
