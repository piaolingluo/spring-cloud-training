package com.example.demo.service.impl;

import com.example.demo.client.account.AccountClient;
import com.example.demo.client.role.RoleClient;
import com.example.demo.exception.DemoException;
import com.example.demo.model.Account;
import com.example.demo.model.Role;
import com.example.demo.request.AccountQueryRequest;
import com.example.demo.request.RoleQueryRequest;
import com.example.demo.response.DataResponse;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gechenpeng
 * @date 2019-06-24
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Integer SUCCESS_CODE = 2000;

    @Autowired
    private AccountClient accountClient;

    @Autowired
    private RoleClient roleClient;

    @Override
    public Account accountInfo(String nickname) {
        DataResponse<Account> response = accountClient.detail(AccountQueryRequest.builder()
                .nickname(nickname)
                .build());
        if (null == response || !SUCCESS_CODE.equals(response.getCode())) {
            throw new DemoException("账号详情接口异常");
        }

        return response.getData();
    }

    @Override
    public String echo(String echoStr) {
        DataResponse<String> response = accountClient.echo(echoStr);
        if (null == response || !SUCCESS_CODE.equals(response.getCode())) {
            throw new DemoException("回写接口异常");
        }

        return response.getData();
    }

    @Override
    public Role roleInfo(String roleName) {
        DataResponse<Role> response = roleClient.detail(RoleQueryRequest.builder()
                .roleName(roleName)
                .build());
        if (null == response || !SUCCESS_CODE.equals(response.getCode())) {
            throw new DemoException("角色详情接口异常");
        }

        return response.getData();
    }
}
