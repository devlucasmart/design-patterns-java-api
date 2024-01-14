package com.devlucasmartins.labpadroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LabPadroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesApplication.class, args);
	}

}
