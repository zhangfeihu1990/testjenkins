package com.example.demo.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Aaron on 2019/3/24.
 */
@RestController
public class TestJenkinsController {

    @RequestMapping("/test")
   public String sayHello(){
       return "hello:jenkins  1232132332131======="+new Date();
   }
}
