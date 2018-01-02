package com.itdoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
// 向服务中心注册
@EnableDiscoveryClient
// 开始feign功能
@EnableFeignClients
// 开始熔断器仪表盘
@EnableHystrixDashboard
// 开启熔断开关(和熔断器 Hystrix jar包内容相关, feign若是不添加次注解, 熔断仪表盘会出现Unable to connect to Command Metric Stream异常)
@EnableCircuitBreaker
public class FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}
}
