package com.cun.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiuYuanZhe on 2018/12/16.
 */
@RestController
@RequestMapping("/handlercontroller")
public class UseHandlerController {

    @GetMapping("/health")
    @ResponseBody
    public String Health(){
        return "rest";
    }
}
