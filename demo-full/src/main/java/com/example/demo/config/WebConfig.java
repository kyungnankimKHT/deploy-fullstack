package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
// 리액트 3000번 연결시켜주는 연결고리
@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry
		.addMapping("/**")
		.allowedOrigins("http://localhost:3000")
		.allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
		.allowedHeaders("*");
		// true
	}
}
