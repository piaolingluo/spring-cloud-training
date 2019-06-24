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
@ApiModel("账户查询")
public class AccountQueryRequest extends BaseBean {

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称", required = true, example = "小黄鸭")
    private String nickname;
}
