package com.hzm.serviceconsumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <P>
 * description:
 * </p>
 *
 * @author 黄增猛
 * @since 2018/7/5 20:59
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String test() {
        return "Hello world server port :  " + port;
    }
}
