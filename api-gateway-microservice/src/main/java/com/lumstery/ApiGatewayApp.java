package com.lumstery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class ApiGatewayApp {
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApp.class, args);
	}
}
