package com.example.yunpicture.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName -> PictureReviewRequest
 * @Description
 * @Author User
 * @Date 2025/3/7 16:23 星期五
 * @Version 3.3
 */
@Data
public class PictureReviewRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 状态：0-待审核, 1-通过, 2-拒绝
     */
    private Integer reviewStatus;

    /**
     * 审核信息
     */
    private String reviewMessage;


    private static final long serialVersionUID = 1L;
}
