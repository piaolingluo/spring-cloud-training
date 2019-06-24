package com.example.demo.client.role;

import com.example.demo.model.Role;
import com.example.demo.request.RoleQueryRequest;
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
public class RoleClientFallbackFactory implements FallbackFactory<RoleClient> {

    @Override
    public RoleClient create(Throwable cause) {
        return new RoleClient() {
            @Override
            public DataResponse<Role> detail(RoleQueryRequest roleQueryRequest) {
                log.warn("调用role.detail异常, roleName: {}", roleQueryRequest.getRoleName(), cause);
                return null;
            }
        };
    }
}
