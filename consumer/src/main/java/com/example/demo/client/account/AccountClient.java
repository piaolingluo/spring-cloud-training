package com.example.demo.client.account;

import com.example.demo.api.AccountApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author gechenpeng
 * @date 2019-06-19
 */
@FeignClient(name = "provider", fallbackFactory = AccountClientFallbackFactory.class)
public interface AccountClient extends AccountApi {
}
