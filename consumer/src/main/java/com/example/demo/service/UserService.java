package com.example.demo.service;

import com.example.demo.model.Account;
import com.example.demo.model.Role;

/**
 * @author gechenpeng
 * @date 2019-06-24
 */
public interface UserService {

    Account accountInfo(String nickname);

    String echo(String echoStr);

    Role roleInfo(String roleName);
}
