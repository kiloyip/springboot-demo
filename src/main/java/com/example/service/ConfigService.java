package com.example.service;
// 此处没有 @service 声明 bean，但已经通过配置类注入到ioc容器
public class ConfigService {
	public void say() {
		System.out.println("可注入的 configService，在配置类配置了");
	}
}
