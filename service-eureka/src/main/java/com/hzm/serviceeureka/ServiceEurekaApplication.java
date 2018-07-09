package com.hzm.serviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author huang
 */
@EnableEurekaServer
@SpringBootApplication
public class ServiceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEurekaApplication.class, args);
		System.err.println("ヾ(◍°∇°◍)ﾉﾞ    ServiceEurekaApplication 启动成功      ヾ(◍°∇°◍)ﾉﾞ\n");
	}
}
