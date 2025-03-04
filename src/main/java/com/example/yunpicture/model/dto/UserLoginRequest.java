package com.example.yunpicture.model.dto;

import lombok.Data;

/**
 * @ClassName -> UserLoginRequest
 * @Description
 * @Author User
 * @Date 2025/3/4 13:09 星期二
 * @Version 3.3
 */
@Data
public class UserLoginRequest {

    private static final long serialVersionUID = 6353770182623837675L;
    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}