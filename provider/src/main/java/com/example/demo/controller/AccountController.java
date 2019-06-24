package com.example.demo.controller;

import com.example.demo.api.AccountApi;
import com.example.demo.model.Account;
import com.example.demo.request.AccountQueryRequest;
import com.example.demo.response.DataResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author gechenpeng
 * @date 2019-06-19
 */
@Api(tags = "账户管理")
@RestController
@Slf4j
public class AccountController implements AccountApi {

    @ApiOperation("账号详情")
    @Override
    public DataResponse<Account> detail(@RequestBody AccountQueryRequest accountQueryRequest) {
        int sleepTime = new Random().nextInt(10000);

        try {
            Thread.sleep(sleepTime);
            log.error("sleepTime: " + sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return DataResponse.ok(Account.builder()
                .nickname(accountQueryRequest.getNickname())
                .build());
    }

    @ApiOperation("回写")
    @Override
    public DataResponse<String> echo(@RequestBody String echoStr) {
        return DataResponse.ok(echoStr);
    }
}
