package com.example.yunpicture.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName -> UserVO
 * @Description 对返回的用户信息进行脱敏
 * @Author User
 * @Date 2025/3/5 16:37 星期三
 * @Version 3.3
 */
@Data
public class UserVO implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 用户简介
     */
    private String userProfile;

    /**
     * 用户角色：user/admin
     */
    private String userRole;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}
