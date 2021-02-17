package com.zh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/toLogin")
    public String toLogin(){
        return "/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("name")String name,@RequestParam("password") String password){
        System.out.println(name+password);
        return "redirect:toWelcome";
    }
}
