package com.example.yunpicture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yunpicture.model.dto.picture.PictureQueryRequest;
import com.example.yunpicture.model.dto.picture.PictureReviewRequest;
import com.example.yunpicture.model.dto.picture.PictureUploadByBatchRequest;
import com.example.yunpicture.model.dto.picture.PictureUploadRequest;
import com.example.yunpicture.model.entity.Picture;
import com.example.yunpicture.model.entity.User;
import com.example.yunpicture.model.vo.PictureVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author User
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-03-06 17:50:39
*/
public interface PictureService extends IService<Picture> {
    /**
     * 上传图片
     *
     * @param inputSource 文件输入源
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(Object inputSource,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    /**
     * 分页查询
     * @param pictureQueryRequest
     * @return
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    /**
     * 获取单个图片封装
     * @param picture
     * @param request
     * @return
     */
    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    /**
     * 分页获取图片封装
     * @param picturePage
     * @param request
     * @return
     */

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    //校验图片
    void validPicture(Picture picture);

    /**
     * 图片审核
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    /**
     * 状态重置 "待审核" + 管理员自动过审
     * @param picture
     * @param loginUser
     */
    void fillReviewParams(Picture picture, User loginUser);

    /**
     * 批量抓取和创建图片
     *
     * @param pictureUploadByBatchRequest
     * @param loginUser
     * @return 成功创建的图片数
     */
    Integer uploadPictureByBatch(
            PictureUploadByBatchRequest pictureUploadByBatchRequest,
            User loginUser
    );

}
