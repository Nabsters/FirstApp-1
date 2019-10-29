package com.programwitherik.restservice.FirstApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/helloworld")
@RestController

public class HelloWorld {

   @Value("${spring.message}")
   private String message;


   @GetMapping
    public String hello()
    {
        return message;
    }



}
