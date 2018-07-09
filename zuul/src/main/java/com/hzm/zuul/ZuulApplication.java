package com.hzm.zuul;

import com.hzm.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author huang
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	/**
	 * 启用过滤器,需要定义具体的bean才能生效 或者添加注解实现
	 * @return AccessFilter
	 */
	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}
}
