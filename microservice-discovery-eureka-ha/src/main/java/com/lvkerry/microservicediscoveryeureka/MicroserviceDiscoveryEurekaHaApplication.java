package com.lvkerry.microservicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author KerryZhang
 * Eureka 注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryEurekaHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDiscoveryEurekaHaApplication.class, args);
    }
}
