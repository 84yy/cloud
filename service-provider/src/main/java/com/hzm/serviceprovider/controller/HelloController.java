package com.hzm.serviceprovider.controller;

import com.hzm.serviceprovider.rpc.HelloRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <P>
 * description:
 * </p>
 *
 * @author 黄增猛
 * @since 2018/7/6 18:21
 */
@RequestMapping
@RestController
public class HelloController {

    @Autowired
    private HelloRpc helloRpc;

    @GetMapping("/hello")
    public String hello(){
       return helloRpc.hello();
    }
}
