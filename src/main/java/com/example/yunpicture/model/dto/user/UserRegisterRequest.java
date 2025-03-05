package com.example.yunpicture.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName -> UserRegisterRequest
 * @Description  用户注册请求
 * @Author User
 * @Date 2025/3/4 10:39 星期二
 * @Version 3.3
 */
@Data
public class UserRegisterRequest implements Serializable {


    private static final long serialVersionUID = 6353770182623837675L;
    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 确认密码
     */
    private String checkPassword;
}
