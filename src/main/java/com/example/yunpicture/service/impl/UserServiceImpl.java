package com.example.yunpicture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yunpicture.model.entity.User;
import com.example.yunpicture.service.UserService;
import com.example.yunpicture.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author User
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2025-03-03 18:14:33
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




