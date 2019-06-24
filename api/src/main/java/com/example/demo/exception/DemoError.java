package com.example.demo.exception;

import lombok.Getter;

/**
 * @author gechenpeng
 * @date 2019-03-09
 */
@Getter
public enum DemoError {

    /**
     * 未知异常
     */
    UNKNOWN_ERROR(1001, "未知异常"),

    /**
     * 参数非法
     */
    PARAM_INVALID(1002, "参数非法"),

    PLEASE_TRY_AGAIN_LATER(1003, "请您稍后再试"),

    INVALID_SIGNATURE(1004, "非法的签名");

    /**
     * 错误码
     */
    private int errorCode;

    /**
     * 错误消息
     */
    private String message;

    DemoError(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }
}
