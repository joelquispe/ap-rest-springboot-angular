package com.joel.reto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@ComponentScan(value = "com.joel.reto")
@SpringBootApplication
public class Reto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto1Application.class, args);
		
	}

}
