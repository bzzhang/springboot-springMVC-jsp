package com.springboot.springmvc.service;

import org.springframework.stereotype.Service;

/**
 * Created by zbz on 2017/2/14.
 */
@Service
public class HomeService {

    public String hello(){
        return "hello I'm service";
    }
}
