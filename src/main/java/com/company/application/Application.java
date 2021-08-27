package com.company.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication(scanBasePackages = {"com.company.**.**"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("Application is running...");
	}
}
