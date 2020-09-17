package com.ejemplo3_springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Ejemplo3SpringBootJbossEapApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Ejemplo3SpringBootJbossEapApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ejemplo3SpringBootJbossEapApplication.class, args);
	}
	
	@RestController
	class HelloController{
		@RequestMapping("/hello")
		@GetMapping
		String hello() {
			return "Hello World   !";
		}
	}

}
