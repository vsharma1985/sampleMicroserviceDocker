package com.sample.app.microService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableEurekaClient
@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.sample.app.microService")
public class MicroServicesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesAppApplication.class, args);
	}
}
