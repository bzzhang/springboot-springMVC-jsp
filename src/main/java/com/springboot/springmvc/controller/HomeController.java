package com.springboot.springmvc.controller;
import com.springboot.springmvc.entity.Account;
import com.springboot.springmvc.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.Date;
import java.util.Map;

/**
 * Created by zbz on 2017/2/14.
 */

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/home")
    @ResponseBody
    String home() {
        String result=homeService.hello();
        homeService.findById();
        return result;
    }

    @GetMapping("/index")
    public String index(Map<String, Object> model) {

        model.put("time", new Date());
        model.put("message", "hello model1");
        return "home";
    }

    @RequestMapping(value = "/helloJsp")
    public ModelAndView helloJsp(Map<String, Object> map) {
        map.put("mvcjsp","mvcjsp2");
        return new ModelAndView("hellojsp");
    }


    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }
}
