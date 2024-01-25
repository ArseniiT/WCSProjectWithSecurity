package com.wildcodeschool.myprojectwithsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the WCS!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin!!!";
    }

    @GetMapping("/user")
    public String user() {
        return "Hello User!!!";
    }
}
