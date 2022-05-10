package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "PROPERTY MANAGEMENT SYSTEM", version = "2.5.0",description = "PMS"))
public class PpmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PpmsApplication.class, args);
	}

}
