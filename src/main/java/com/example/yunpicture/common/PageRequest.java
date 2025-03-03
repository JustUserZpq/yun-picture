package com.example.yunpicture.common;

import lombok.Data;

/**
 * @ClassName -> PageRequest
 * @Description
 * @Author User
 * @Date 2025/3/3 10:46 星期一
 * @Version 3.3
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认降序）
     */
    private String sortOrder = "descend";
}
