package com.example.demo.request;

import com.example.demo.model.BaseBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gechenpeng
 * @date 2019-06-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("角色查询")
public class RoleQueryRequest extends BaseBean {

    /**
     * 角色名
     */
    @ApiModelProperty(value = "角色名", required = true, example = "管理员")
    private String roleName;
}
