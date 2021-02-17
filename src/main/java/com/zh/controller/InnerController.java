package com.zh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class InnerController {
    @RequestMapping("/inner")
    public String inner(Model model){
        model.addAttribute("date",new Date());
        return "innerObject";
    }
}
