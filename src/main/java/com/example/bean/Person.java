package com.example.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 
 * @author kilo
 * value 	字面量中获取值
 * ${key} 	application.yml中获取值
 * #{SpEL}
 * 
 */
// @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
//@ConfigurationProperties(prefix = "person")
@Component
public class Person {
	@Value("${person.lastName}")
	private String lastName;
	
	@Value("#{11*2}")
	private Integer age;
	
	@Value("true")
	private boolean boss;
	

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean isBoss() {
		return boss;
	}

	public void setBoss(boolean boss) {
		this.boss = boss;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", age=" + age + ", boss=" + boss + "]";
	}

}
