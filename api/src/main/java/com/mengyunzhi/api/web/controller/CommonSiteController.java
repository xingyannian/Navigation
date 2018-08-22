package com.mengyunzhi.api.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by XINGYANNIAN on 2018/8/21.
 */
@RestController
public class CommonSiteController {
    @GetMapping("/hello")
    public String hello(){
        String hello = "hello spring boot";
        return hello;
    }
}
