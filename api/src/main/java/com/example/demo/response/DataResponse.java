package com.example.demo.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 带数据的响应
 *
 * @author xiaogege
 * @date 2018-12-03
 */
@Getter
@NoArgsConstructor
public class DataResponse<T> extends BaseResponse {

    /**
     * 数据
     */
    private T data;

    private DataResponse(Integer code, String message, T data) {
        super(code, message);
        this.data = data;
    }

    /**
     * 带数据的成功响应
     *
     * @param data 数据
     * @param <T>  数据的类型
     * @return 响应对象
     */
    public static <T> DataResponse<T> ok(T data) {
        return new DataResponse(SUCCESS_CODE, SUCCESS_MSG, data);
    }
}
