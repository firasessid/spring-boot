package com.bezkoder.springjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration
@ComponentScan({"com.bezkoder.springjwt"})
@SpringBootApplication
public class AkumaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkumaApplication.class, args);
	}

}
