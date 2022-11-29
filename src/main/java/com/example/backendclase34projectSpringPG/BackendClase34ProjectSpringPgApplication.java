package com.example.backendclase34projectSpringPG;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendClase34ProjectSpringPgApplication {

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");
		SpringApplication.run(BackendClase34ProjectSpringPgApplication.class, args);
	}

}
