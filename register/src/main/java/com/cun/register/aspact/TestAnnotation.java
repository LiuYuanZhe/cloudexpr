package com.cun.register.aspact;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by LiuYuanZhe on 18/11/21.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    /**
     *
     * 操作类型
     */
    int opModule();

    /**
     *
     * 是否批量
     */
    String batch();

    /**
     *
     * 操作来源(页面+操作)
     */
    String source();
}
