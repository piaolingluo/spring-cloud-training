package com.example.demo.api;

import com.example.demo.model.Role;
import com.example.demo.request.RoleQueryRequest;
import com.example.demo.response.DataResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gechenpeng
 * @date 2019-06-19
 */
@RequestMapping("role")
public interface RoleApi {

    @PostMapping("detail")
    DataResponse<Role> detail(@RequestBody RoleQueryRequest roleQueryRequest);
}
