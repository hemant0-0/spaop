package com.spaop.spaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication

@EnableAspectJAutoProxy
public class SpaopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpaopApplication.class, args);
	}

}
