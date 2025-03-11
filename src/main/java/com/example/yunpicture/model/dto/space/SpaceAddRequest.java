package com.example.yunpicture.model.dto.space;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName -> SpanceAddRequest
 * @Description 空间创建请求
 * @Author User
 * @Date 2025/3/11 16:44 星期二
 * @Version 3.3
 */
@Data
public class SpaceAddRequest implements Serializable {

    /**
     * 空间名称
     */
    private String spaceName;

    /**
     * 空间级别：0-普通版 1-专业版 2-旗舰版
     */
    private Integer spaceLevel;

    private static final long serialVersionUID = 1L;
}
