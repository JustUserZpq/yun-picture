package com.example.yunpicture.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yunpicture.model.dto.UserRegisterRequest;
import com.example.yunpicture.model.entity.User;
import com.example.yunpicture.model.vo.LoginUserVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author User
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-03-03 18:14:33
*/
public interface UserService extends IService<User> {
    //用户注册 返回新用户ID
    long userRegister(UserRegisterRequest userRegisterRequest);

    /**
     * 获取加密后的密码
     * @param userPassWord
     * @return
     */
    String getEncryptPassword(String userPassWord);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息 VO 不是所有信息都返回给前端
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获得脱敏后的用户登陆信息
     * @param user
     * @return
     */

    LoginUserVO getLoginUserVO(User user);
}
