package com.example.yunpicture.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName -> DeleteRequest
 * @Description
 * @Author User
 * @Date 2025/3/3 10:45 星期一
 * @Version 3.3
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
