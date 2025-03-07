package com.example.yunpicture.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName -> PictureUploadByBatchRequest
 * @Description
 * @Author User
 * @Date 2025/3/7 19:22 星期五
 * @Version 3.3
 */
@Data
public class PictureUploadByBatchRequest implements Serializable {

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 抓取数量
     */
    private Integer count = 10;
    /**
     * 名称前缀
     */
    private String namePrefix;
    private static final long serialVersionUID = 1L;

}
