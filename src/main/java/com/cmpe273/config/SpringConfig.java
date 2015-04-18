package com.cmpe273.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cmpe273.controller")
public class SpringConfig {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfig.class);
	}
}
