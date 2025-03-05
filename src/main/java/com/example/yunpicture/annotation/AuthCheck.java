package com.example.yunpicture.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName -> AuthCheck
 * @Description
 * @Author User
 * @Date 2025/3/5 15:08 星期三
 * @Version 3.3
 */
@Target(ElementType.METHOD) //注解生效范围
@Retention(RetentionPolicy.RUNTIME) //运行时生效
public @interface AuthCheck {

    /**
     * 必须有某个角色
     */
    String mustRole() default "";
}

