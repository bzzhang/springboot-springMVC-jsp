package com.springboot.springmvc.controller;

import com.springboot.springmvc.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zbz on 2017/2/15.
 */
@RestController
public class RestfulController {

    @Autowired
    private HomeService homeService;

    @RequestMapping("/rest/home")
    String home() {
        String result=homeService.hello();
        return result;
    }
}
