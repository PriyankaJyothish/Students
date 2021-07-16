package com.example.student;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsApplication {

	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger(StudentsApplication.class);
		SpringApplication.run(StudentsApplication.class, args);
		
	
	}

}
