package com.springcloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientRibbon2Application {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
	return new RestTemplate();
    }
    
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientRibbon2Application.class, args);
	}

}
