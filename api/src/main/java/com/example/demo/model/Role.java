package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Role extends BaseBean {
    /**
     * 角色编号
     */
    private Integer id;

    /**
     * 角色名称
     */
    private String roleName;
}