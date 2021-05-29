package com.example.samplespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SampleSpringbootAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SampleSpringbootAppApplication.class, args);
		//updating comments.
		run.close();
	}
}