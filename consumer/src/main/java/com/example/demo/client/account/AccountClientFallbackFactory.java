package com.example.demo.client.account;

import com.example.demo.model.Account;
import com.example.demo.request.AccountQueryRequest;
import com.example.demo.response.DataResponse;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author gechenpeng
 * @date 2019-06-24
 */
@Component
@Slf4j
public class AccountClientFallbackFactory implements FallbackFactory<AccountClient> {

    @Override
    public AccountClient create(Throwable cause) {
        return new AccountClient() {

            @Override
            public DataResponse<Account> detail(AccountQueryRequest accountQueryRequest) {
                log.warn("调用account.detail异常, nickname: {}", accountQueryRequest.getNickname(), cause);
                return null;
            }

            @Override
            public DataResponse<String> echo(String echoStr) {
                log.warn("调用echo异常, echoStr: {}", echoStr, cause);
                return null;
            }
        };
    }
}
