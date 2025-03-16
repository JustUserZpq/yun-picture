package com.example.yunpicture.model.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

/**
 * @ClassName -> SpaceTypeEnum
 * @Description 空间类型枚举类
 * @Author User
 * @Date 2025/3/14 15:30 星期五
 * @Version 3.3
 */
@Getter
public enum SpaceTypeEnum {

    PRIVATE("私有空间", 0),
    TEAM("团队空间", 1);

    private final String text;

    private final int value;

    SpaceTypeEnum(String text, int value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 根据 value 获取枚举
     */
    public static SpaceTypeEnum getEnumByValue(Integer value) {
        if (ObjUtil.isEmpty(value)) {
            return null;
        }
        for (SpaceTypeEnum spaceTypeEnum : SpaceTypeEnum.values()) {
            if (spaceTypeEnum.value == value) {
                return spaceTypeEnum;
            }
        }
        return null;
    }
}
