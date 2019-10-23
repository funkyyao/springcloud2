package com.ho.shawn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class KobeApplication {
	public static void main(String[] args) {
		SpringApplication.run(KobeApplication.class, args);
	}
}
