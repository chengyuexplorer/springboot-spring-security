package com.louis.springboot.spring.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 类      说明  ：  跨域配置类
 * 作        者  ：  yucheng
 * 最后修改时间  ：  2019-03-21
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")	// 允许跨域访问的路径
        .allowedOrigins("*")	       // 允许跨域访问的源
        .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")	// 允许请求方法
        .maxAge(168000)	               // 预检间隔时间
        .allowedHeaders("*")           // 允许头部设置
        .allowCredentials(true);	   // 是否发送cookie
    }
}