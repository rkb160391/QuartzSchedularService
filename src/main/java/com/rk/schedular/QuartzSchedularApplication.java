package com.rk.schedular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.rk.schedular")
public class QuartzSchedularApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuartzSchedularApplication.class, args);
	}
}
