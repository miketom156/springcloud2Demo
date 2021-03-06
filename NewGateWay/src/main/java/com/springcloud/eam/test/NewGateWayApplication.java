package com.springcloud.eam.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NewGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewGateWayApplication.class, args);
	}

	@Bean
	public RouteLocator buildLocator(RouteLocatorBuilder builder){
		return builder.routes().route(r->r.path("/course").uri("test")).build();
	}
	
	
	
}

