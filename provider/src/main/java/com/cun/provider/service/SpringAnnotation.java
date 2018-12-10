package com.cun.provider.service;

import org.reflections.Reflections;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

/**
 * Created by LiuYuanZhe on 2018/12/6.
 */
@Component
public class SpringAnnotation implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("annotation");
        new Reflections("org.springframework")
                .getSubTypesOf(Annotation.class)
                .stream()
                .map(clazz->clazz.getName())
                .sorted()
                .forEach(System.out::println);
        System.out.println("annotation");
    }

}
