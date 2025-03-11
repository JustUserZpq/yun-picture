package com.example.yunpicture.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.SpaceUser;
import com.example.yunpicture.mapper.SpaceUserMapper;
import org.springframework.stereotype.Service;

/**
* @author User
* @description 针对表【space_user(空间用户关联)】的数据库操作Service实现
* @createDate 2025-03-11 22:15:12
*/
@Service
public class SpaceUserServiceImpl extends ServiceImpl<SpaceUserMapper, SpaceUser>
    implements IService<SpaceUser> {

}




