package com.louis.springboot.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类  说明  ：  启动类
 * 作        者  ：  yucheng
 * 最后修改时间  ：  2019-03-21
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.louis.springboot")// 开启包扫描器
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}
}
