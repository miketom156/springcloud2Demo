package com.springcloud.eam.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.client.ConfigClientProperties;

@SpringBootApplication
@EnableDiscoveryClient
public class SeviceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeviceProviderApplication.class, args);
		
	}

}

