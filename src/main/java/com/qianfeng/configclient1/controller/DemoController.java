package com.qianfeng.configclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${foo}")
    private String foo;
    @Value("${server.port}")
    private  String  serverPort;
    @GetMapping("/hello")
    public String hello(){
        return "Hello,这是"+foo +",server.poet = " +serverPort;
    }

}
