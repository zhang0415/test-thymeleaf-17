package com.zh.controller;

import com.zh.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    @RequestMapping("/")
    public String test(Model model){
//        ModelAndView mv = new ModelAndView();
        Person person = new Person("张三","12");
//        mv.setViewName("templates/welcome.html");
//        mv.addObject("person",person);
        model.addAttribute("person",person);
        return "welcome";
    }
}
