package com.example.yunpicture.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName -> PictureUploadRequest
 * @Description
 * @Author User
 * @Date 2025/3/6 18:06 星期四
 * @Version 3.3
 */
@Data
public class PictureUploadRequest implements Serializable {

    /**
     * 图片 id（用于修改）
     */
    private Long id;
    /**
     * 文件地址
     */
    private String fileUrl;
    /**
     * 图片名称
     */
    private String picName;

    private static final long serialVersionUID = 1L;
}
