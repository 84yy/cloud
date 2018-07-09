package com.hzm.serviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huang
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class ServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderApplication.class, args);
		System.err.println("ヾ(◍°∇°◍)ﾉﾞ    ServiceProviderApplication 启动成功      ヾ(◍°∇°◍)ﾉﾞ\n");
	}
}
