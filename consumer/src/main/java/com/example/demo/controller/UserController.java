package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.model.Role;
import com.example.demo.response.DataResponse;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author gechenpeng
 * @date 2019-06-19
 */
@Api(tags = "用户")
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("账户信息")
    @PostMapping("{nickname}/account-info")
    public DataResponse<Account> accountInfo(@PathVariable("nickname") String nickname) {
        return DataResponse.ok(userService.accountInfo(nickname));
    }

    @ApiOperation("回写")
    @PostMapping("echo")
    public DataResponse<String> echo(@RequestBody String echoStr) {
        return DataResponse.ok(userService.echo(echoStr));
    }

    @ApiOperation("角色信息")
    @PostMapping("{roleName}/role-info")
    public DataResponse<Role> roleInfo(@PathVariable("roleName") String roleName) {
        return DataResponse.ok(userService.roleInfo(roleName));
    }
}
