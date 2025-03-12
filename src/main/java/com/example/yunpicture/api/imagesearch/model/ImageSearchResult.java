package com.example.yunpicture.api.imagesearch.model;

import lombok.Data;

/**
 * @ClassName -> ImageSearchResult
 * @Description
 * @Author User
 * @Date 2025/3/11 22:36 星期二
 * @Version 3.3
 */
@Data
public class ImageSearchResult {

    /**
     * 缩略图地址
     */
    private String thumbUrl;

    /**
     * 来源地址
     */
    private String fromUrl;
}
