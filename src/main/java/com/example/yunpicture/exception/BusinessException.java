package com.example.yunpicture.exception;

import lombok.Getter;

/**
 * @ClassName -> BusinessException
 * @Description
 * @Author User
 * @Date 2025/3/3 10:42 星期一
 * @Version 3.3
 */
@Getter
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

}
