package com.example.demo.exception;

import lombok.Getter;

/**
 * @author gechenpeng
 * @date 2019-03-09
 */
@Getter
public class DemoException extends RuntimeException {

    /**
     * 异常码
     */
    protected Integer errorCode;

    /**
     * 详细信息
     */
    protected String detailMessage;

    public DemoException(String message) {
        super(message);
    }

    public DemoException(DemoError error) {
        super(error.getMessage());
        this.errorCode = error.getErrorCode();
    }

    public DemoException(DemoError error, String detailMessage) {
        super(error.getMessage());
        this.errorCode = error.getErrorCode();
        this.detailMessage = detailMessage;
    }
}
