package com.danekblom.lexicon.finalprojectrest.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.danekblom.lexicon.finalprojectrest"})
public class FinalProjectRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectRestApplication.class, args);
	}
}
