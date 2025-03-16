package com.example.yunpicture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.yunpicture.model.dto.spaceuser.SpaceUserAddRequest;
import com.example.yunpicture.model.dto.spaceuser.SpaceUserQueryRequest;
import com.example.yunpicture.model.entity.SpaceUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yunpicture.model.vo.SpaceUserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author User
* @description 针对表【space_user(空间用户关联)】的数据库操作Service
* @createDate 2025-03-14 15:50:58
*/
public interface SpaceUserService extends IService<SpaceUser> {
    /**
     * 添加空间成员
     * @param spaceUserAddRequest
     * @return
     */
    long addSpaceUser(SpaceUserAddRequest spaceUserAddRequest);
    /**
     * 检验空间成员对象
     * @param spaceUser
     * @param add
     */
    void validSpaceUser(SpaceUser spaceUser, boolean add);
    /**
     * 查询对象转化
     * @param spaceUserQueryRequest
     * @return
     */
    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);
    /**
     * 获取空间成员封装类
     * @param spaceUser
     * @param request
     * @return
     */
    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);
    /**
     * 查询封装类
     * @param spaceUserList
     * @return
     */
    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);
}
