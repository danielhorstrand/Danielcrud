package com.DanielHcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class DanielHcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanielHcrudApplication.class, args);
	}

}
