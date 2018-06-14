package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.service.ConfigService;

/**
 * 
 * @author kilo
 * springboot 配置类
 *
 */

// @Configuration：指明当前类是一个配置类；就是来替代之前的Spring配置文件
@Configuration
public class MyAppConfig {
	
	// @Bean 将方法的返回值添加注入到容器中
	@Bean
	public ConfigService cs(){
		System.out.println("配置类@Bean给容器中添加组件了...");
		return new ConfigService();
	}
}
// <bean id = "configService" class = "com.example.service.ConfigService">