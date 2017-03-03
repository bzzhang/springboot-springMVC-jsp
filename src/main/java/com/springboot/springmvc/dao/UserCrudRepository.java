package com.springboot.springmvc.dao;

import com.springboot.springmvc.entity.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zbz on 2017/3/3.
 */
public interface UserCrudRepository extends CrudRepository<Account, String> {
}
