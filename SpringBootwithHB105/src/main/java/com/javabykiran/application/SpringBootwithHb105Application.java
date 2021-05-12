package com.javabykiran.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan("com.javabykiran")
public class SpringBootwithHb105Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootwithHb105Application.class, args);
	}

}
