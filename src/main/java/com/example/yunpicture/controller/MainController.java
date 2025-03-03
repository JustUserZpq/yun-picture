package com.example.yunpicture.controller;

import com.example.yunpicture.common.BaseResponse;
import com.example.yunpicture.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName -> MainController
 * @Description
 * @Author User
 * @Date 2025/3/3 10:51 星期一
 * @Version 3.3
 */
@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 健康检查
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
