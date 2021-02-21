package com.example.servicezk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceZkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZkApplication.class, args);
    }

}
