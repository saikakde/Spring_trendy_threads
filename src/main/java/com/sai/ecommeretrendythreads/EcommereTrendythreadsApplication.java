package com.sai.ecommeretrendythreads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.sai.model")
public class EcommereTrendythreadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommereTrendythreadsApplication.class, args);
	}

}
