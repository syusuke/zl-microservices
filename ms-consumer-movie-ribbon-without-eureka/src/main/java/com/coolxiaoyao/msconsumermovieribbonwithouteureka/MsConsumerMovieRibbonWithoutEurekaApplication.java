package com.coolxiaoyao.msconsumermovieribbonwithouteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient

@SpringBootApplication
public class MsConsumerMovieRibbonWithoutEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsConsumerMovieRibbonWithoutEurekaApplication.class, args);
    }
}
