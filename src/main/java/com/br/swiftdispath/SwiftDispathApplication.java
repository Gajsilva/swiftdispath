package com.br.swiftdispath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SwiftDispathApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiftDispathApplication.class, args);
	}

}
