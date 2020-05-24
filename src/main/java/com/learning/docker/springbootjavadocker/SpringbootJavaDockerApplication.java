package com.learning.docker.springbootjavadocker;

import com.learning.docker.springbootjavadocker.controller.EmployeeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJavaDockerApplication {

	public static final Logger LOGGER = LoggerFactory.getLogger(SpringbootJavaDockerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJavaDockerApplication.class, args);
		LOGGER.info("================ springboot-java-docker : Application Started ==================");
	}

}
