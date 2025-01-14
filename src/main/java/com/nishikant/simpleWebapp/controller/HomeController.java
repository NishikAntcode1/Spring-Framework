package com.nishikant.simpleWebapp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller to handle the request that we are getting from the client
@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet() {
        return "hello welcome to my website!!!";
    }

}
