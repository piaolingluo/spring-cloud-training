package com.example.demo.client.role;

import com.example.demo.api.RoleApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author gechenpeng
 * @date 2019-06-24
 */
@FeignClient(name = "provider", fallbackFactory = RoleClientFallbackFactory.class)
public interface RoleClient extends RoleApi {
}
