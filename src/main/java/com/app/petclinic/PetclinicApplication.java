package com.app.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.modules"})
public class PetclinicApplication {
	public static void main(String[] args) {
		SpringApplication.run(PetclinicApplication.class, args);
	}
}
