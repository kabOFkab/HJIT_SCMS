package com.hjit.scms;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.hjit.scms.util.LoginInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor())
		.addPathPatterns("/**")
		.excludePathPatterns("/")
		.excludePathPatterns("/login")
		.excludePathPatterns("/login/loginForm")
		.excludePathPatterns("/logout")
		.excludePathPatterns("/js/**")
		.excludePathPatterns("/css/**");
	}
}