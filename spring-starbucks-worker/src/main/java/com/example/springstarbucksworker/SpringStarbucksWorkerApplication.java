package com.example.springstarbucksworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringStarbucksWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStarbucksWorkerApplication.class, args);
	}

}
