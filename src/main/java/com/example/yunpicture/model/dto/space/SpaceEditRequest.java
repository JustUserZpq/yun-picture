package com.example.yunpicture.model.dto.space;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName -> SpaceEditRequest
 * @Description 空间编辑请求
 * @Author User
 * @Date 2025/3/11 16:51 星期二
 * @Version 3.3
 */
@Data
public class SpaceEditRequest implements Serializable {

    /**
     * 空间 id
     */
    private Long id;

    /**
     * 空间名称
     */
    private String spaceName;

    private static final long serialVersionUID = 1L;
}
