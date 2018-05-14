package com.danekblom.lexicon.finalprojectrest.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.danekblom.lexicon.finalprojectrest"})
@EnableJpaRepositories(basePackages = "com.danekblom.lexicon.finalprojectrest.data")
@EntityScan(basePackages = "com.danekblom.lexicon.finalprojectrest.model")
public class FinalProjectRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectRestApplication.class, args);
	}
}
