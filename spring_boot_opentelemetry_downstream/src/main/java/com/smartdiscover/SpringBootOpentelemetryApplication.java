package com.smartdiscover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootOpentelemetryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOpentelemetryApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        // Do any additional configuration here
        return new RestTemplateBuilder().build();
    }
}
