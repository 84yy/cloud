package com.hzm.serviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author huang
 */
@EnableEurekaClient
@SpringBootApplication
@EnableAutoConfiguration
public class ServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumerApplication.class, args);
		System.err.println("ヾ(◍°∇°◍)ﾉﾞ    ServiceConsumerApplication 启动成功      ヾ(◍°∇°◍)ﾉﾞ\n");
	}
}
