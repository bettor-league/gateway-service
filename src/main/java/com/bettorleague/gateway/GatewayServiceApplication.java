package com.bettorleague.gateway;

import com.bettorleague.microservice.swagger.SwaggerMicroservice;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SwaggerMicroservice
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Gateway API", version = "1.0", description = "Documentation Gateway API v1.0"))
public class GatewayServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
}
