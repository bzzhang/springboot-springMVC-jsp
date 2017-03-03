package com.springboot.springmvc.service;

import com.springboot.springmvc.dao.UserCrudRepository;
import com.springboot.springmvc.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zbz on 2017/2/14.
 */
@Service
public class HomeService {

    @Autowired
    private UserCrudRepository userCrudRepository;

    public String hello(){
        return "hello I'm service";
    }

    public void findById(){
        Account account=userCrudRepository.findOne("shtest");
        System.out.println(account.getId());
    }
}
