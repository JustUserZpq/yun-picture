package com.example.yunpicture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yunpicture.model.dto.user.UserQueryRequest;
import com.example.yunpicture.model.dto.user.UserRegisterRequest;
import com.example.yunpicture.model.entity.User;
import com.example.yunpicture.model.vo.LoginUserVO;
import com.example.yunpicture.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    /**
     * 获取当前登录用户 不返回给前端，后端做权限校验之类的逻辑使用
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request
     * @return 只是一个动作
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取脱敏后的单个用户信息
     * @param user
     * @return
     */
    UserVO getUserVO(User user);

    /**
     * 获取脱敏后的用户列表
     * @param userList
     * @return
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 将查询请求转化为QueryWrapper
     * @param userQueryRequest
     * @return
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 是否为管理员
     *
     * @param user
     * @return
     */
    boolean isAdmin(User user);

}
