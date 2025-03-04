package com.example.yunpicture.controller;

import com.example.yunpicture.common.BaseResponse;
import com.example.yunpicture.common.ResultUtils;
import com.example.yunpicture.exception.ErrorCode;
import com.example.yunpicture.exception.ThrowUtils;
import com.example.yunpicture.model.dto.UserLoginRequest;
import com.example.yunpicture.model.dto.UserRegisterRequest;
import com.example.yunpicture.model.vo.LoginUserVO;
import com.example.yunpicture.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName -> UserController
 * @Description
 * @Author User
 * @Date 2025/3/4 12:38 星期二
 * @Version 3.3
 */
@RestController
@RequestMapping("/")
public class UserController {
    //区分@Autowired  @Resource按名称匹配，更精确
    @Resource
    private UserService userService;
    /**
     * 用户注册
     */
    @PostMapping("/register")
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterRequest userRegisterRequest) {
        ThrowUtils.throwIf(userRegisterRequest == null, ErrorCode.PARAMS_ERROR);
        long result = userService.userRegister(userRegisterRequest);
        return ResultUtils.success(result);

    }
    /**
     * 用户登陆
     */
    @PostMapping("/login")
    public BaseResponse<LoginUserVO> userLogin(@RequestBody UserLoginRequest userLoginRequest, HttpServletRequest request) {
        ThrowUtils.throwIf(userLoginRequest == null, ErrorCode.PARAMS_ERROR);
        String userAccount = userLoginRequest.getUserAccount();
        String userPassword = userLoginRequest.getUserPassword();
        LoginUserVO loginUserVO = userService.userLogin(userAccount, userPassword, request);
        return ResultUtils.success(loginUserVO);
    }









}