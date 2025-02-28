package com.gateway.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.context.ApplicationContext;


@EnableDiscoveryClient  // Enables Eureka Client
@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
    	ApplicationContext context = SpringApplication.run(ApiGatewayApplication.class, args);
        Environment env = context.getEnvironment();
        
        // Print application name
        System.out.println("API Application Name: " + env.getProperty("spring.application.name"));
    }
}
