package com.example.demo.controller;

import com.example.demo.api.RoleApi;
import com.example.demo.model.Role;
import com.example.demo.request.RoleQueryRequest;
import com.example.demo.response.DataResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gechenpeng
 * @date 2019-06-24
 */
@Api(tags = "角色管理")
@RestController
public class RoleController implements RoleApi {

    @ApiOperation("角色详情")
    @Override
    public DataResponse<Role> detail(@RequestBody RoleQueryRequest roleQueryRequest) {
        return DataResponse.ok(Role.builder()
                .roleName(roleQueryRequest.getRoleName())
                .build());
    }
}
