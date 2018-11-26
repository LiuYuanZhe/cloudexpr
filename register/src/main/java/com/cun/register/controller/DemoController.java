package com.cun.register.controller;

import com.cun.register.aspact.TestAnnotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiuYuanZhe on 18/11/6.
 */
@RestController
@RequestMapping("/start")
public class DemoController {

    @GetMapping("/getmapping")
    @ResponseBody
    @TestAnnotation(batch = "no", source = "add",opModule = 1)
    public String startRest(int id){
        id = 2;
        return "Thanks";
    }
}
