package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account extends BaseBean {
    /**
     * 账号
     */
    private Integer id;

    /**
     * 昵称
     */
    private String nickname;

}