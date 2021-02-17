package com.zh.controller;

import com.zh.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    @RequestMapping("/")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        Person person = new Person("张三","12");
        mv.setViewName("welcome");
        mv.addObject("person",person);
        System.out.println("测试成功");
        return mv;
    }
}
