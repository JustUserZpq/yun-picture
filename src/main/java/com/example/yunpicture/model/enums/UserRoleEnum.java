package com.example.yunpicture.model.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

/**
 * @ClassName -> UserRoleEnum
 * @Description
 * @Author User
 * @Date 2025/3/4 10:10 星期二
 * @Version 3.3
 */
@Getter
public enum UserRoleEnum {
    USER("用户","user"),
    ADMIN("管理员","admin");

    private final String text;
    private final String value;

    UserRoleEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    // 根据value获取枚举对象（用于参数校验）
    // 若枚举类很多，可以存入Map中，遍历Map直接查找
    public static UserRoleEnum getEnumByValue(String value) {
        if (ObjUtil.isEmpty(value)){
            return null;
        }

        for (UserRoleEnum anEnum : UserRoleEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        //Map<String,UserRoleEnum> map = new HashMap<>();
        //map.put("admin",ADMIN);
        return null;
    }



}