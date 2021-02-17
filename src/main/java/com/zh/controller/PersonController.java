package com.zh.controller;

import com.zh.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class PersonController {

    @RequestMapping("/toWelcome")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        Person person = new Person("张三","12");
        mv.setViewName("welcome");
        mv.addObject("person",person);
        mv.addObject("mes","zh");
        mv.addObject("num",3);
        Person person2 = new Person("张4","13");
        Person person3 = new Person("张5","14");
        Person person4 = new Person("张6","15");
        Person person5 = new Person("张7","16");
        ArrayList<Person> list = new ArrayList<>();
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        mv.addObject("list",list);
        return mv;
    }
}
