package com.symboisis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.symboisis","com.controller","com.dao","com.model","com.service"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.dao")
public class HealthcareSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareSystemApplication.class, args);
	}

}
