package com.example.demo.response;

import com.example.demo.exception.DemoException;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 基本响应
 *
 * @author xiaogege
 * @date 2018-11-30
 */
@Getter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse {

    protected static final Integer SUCCESS_CODE = 2000;

    protected static final String SUCCESS_MSG = "成功";

    private static final String DELIMITER = ", ";

    /**
     * 结果码
     */
    private Integer code;

    /**
     * 消息
     */
    private String message;

    /**
     * 详细消息
     */
    private String detailMessage;

    protected BaseResponse(Integer code, String message, String... detailMessages) {
        this.code = code;
        this.message = message;
        if (detailMessages.length > 0 && null != detailMessages[0]) {
            this.detailMessage = Arrays.stream(detailMessages).collect(Collectors.joining(DELIMITER));
        }
    }

    /**
     * 成功响应
     *
     * @return 响应对象
     */
    public static BaseResponse ok() {
        return new BaseResponse(SUCCESS_CODE, SUCCESS_MSG);
    }

    /**
     * 失败响应
     *
     * @param e 异常对象
     * @return 响应对象
     */
    public static BaseResponse error(DemoException e) {
        return new BaseResponse(e.getErrorCode(), e.getMessage(), e.getDetailMessage());
    }

    /**
     * 失败响应
     *
     * @param code           结果码
     * @param message        消息
     * @param detailMessages 详细消息
     * @return
     */
    public static BaseResponse error(Integer code, String message, String... detailMessages) {
        return new BaseResponse(code, message, detailMessages);
    }
}
