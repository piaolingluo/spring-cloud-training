package com.example.demo.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

/**
 * 基本业务参数
 *
 * @author xiaogege
 * @date 2018-10-22
 */
@Slf4j
public abstract class BaseBean {

    public <T> T toBean(Class<T> clazz) {
        T t = null;
        try {
            t = clazz.newInstance();
            BeanUtils.copyProperties(this, t);
        } catch (Exception e) {
            log.warn("拷贝bean失败", e);
        }
        return t;
    }
}
