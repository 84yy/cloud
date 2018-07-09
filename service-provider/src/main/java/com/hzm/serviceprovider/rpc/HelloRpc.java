package com.hzm.serviceprovider.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <P>
 * description:
 * </p>
 *
 * @author 黄增猛
 * @since 2018/7/6 18:07
 */
@FeignClient("service-consumer")
@Component
public interface HelloRpc {

    @GetMapping("/hello")
    String hello();

}
