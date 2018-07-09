package com.hzm.serviceeureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <P>
 * description:
 * </p>
 *
 * @author 黄增猛
 * @since 2018/7/6 17:51
 */
@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }
}
