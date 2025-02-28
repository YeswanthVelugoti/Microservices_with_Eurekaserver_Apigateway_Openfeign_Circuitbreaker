package com.eureka.eureka_apigate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaServer  // Enables Eureka Server
public class EurekaServerApplication {
    public static void main(String[] args) {
    	ApplicationContext context =  SpringApplication.run(EurekaServerApplication.class, args);
        Environment env = context.getEnvironment();
        
        // Print application name
        System.out.println("Application Name: " + env.getProperty("spring.application.name"));
    }
}
