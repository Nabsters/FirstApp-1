package com.programwitherik.restservice.FirstApp.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/helloworld")
@RestController

public class HelloWorldController {
    @RequestMapping("/helloworld")
    @RestController
    public class HelloWorld{

        @Value("${spring.name}")

        private String name;

        @GetMapping
        public String hello()
        {
            return name;
        }

    }

}
