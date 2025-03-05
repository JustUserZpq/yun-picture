package com.example.yunpicture.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName -> UserAddRequest
 * @Description
 * @Author User
 * @Date 2025/3/5 16:29 星期三
 * @Version 3.3
 */
@Data
public class UserAddRequest implements Serializable {

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 用户简介
     */
    private String userProfile;

    /**
     * 用户角色: user, admin
     */
    private String userRole;

    private static final long serialVersionUID = 1L;
}
