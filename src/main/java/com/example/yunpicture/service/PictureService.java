package com.example.yunpicture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yunpicture.model.dto.picture.PictureQueryRequest;
import com.example.yunpicture.model.dto.picture.PictureUploadRequest;
import com.example.yunpicture.model.entity.Picture;
import com.example.yunpicture.model.entity.User;
import com.example.yunpicture.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

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
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
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
}
