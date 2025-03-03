package com.example.yunpicture.common;

import com.example.yunpicture.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName -> BaseResponse
 * @Description
 * @Author User
 * @Date 2025/3/3 10:45 星期一
 * @Version 3.3
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }  //调用前一个构造函数

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}

