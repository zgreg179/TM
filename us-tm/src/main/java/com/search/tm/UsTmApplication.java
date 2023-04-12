package com.search.tm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class UsTmApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsTmApplication.class, args);
	}

}
