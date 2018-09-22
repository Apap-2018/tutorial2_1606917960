package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration	
@ComponentScan({"com.example.demo", "controller"})
public class Tutorial2Application {

	public static void main(String[] args) {
		SpringApplication.run(Tutorial2Application.class, args);
	}
}
