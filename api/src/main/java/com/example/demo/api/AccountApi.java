package com.example.demo.api;

import com.example.demo.model.Account;
import com.example.demo.request.AccountQueryRequest;
import com.example.demo.response.DataResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gechenpeng
 * @date 2019-06-19
 */
@RequestMapping("account")
public interface AccountApi {

    @PostMapping("detail")
    DataResponse<Account> detail(@RequestBody AccountQueryRequest accountQueryRequest);

    @PostMapping("echo")
    DataResponse<String> echo(@RequestBody String echoStr);
}
