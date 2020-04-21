package com.amdocs.media.assignement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
public class AssignementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignementApplication.class, args);
	}

}
