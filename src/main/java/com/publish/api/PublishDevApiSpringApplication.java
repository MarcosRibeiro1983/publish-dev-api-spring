package com.publish.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default server url")})
@SpringBootApplication
public class PublishDevApiSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublishDevApiSpringApplication.class, args);
	}

}

