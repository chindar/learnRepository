package com.itdoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
// 向服务中心注册
@EnableDiscoveryClient
// 开启熔断器
@EnableHystrix
// 开启熔断器仪表盘
@EnableHystrixDashboard
// 开启熔断开关(ribbon不添加此注解, 此代码熔断机制依然生效, 熔断仪表盘也正常运转)
@EnableCircuitBreaker
public class RibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}
}
