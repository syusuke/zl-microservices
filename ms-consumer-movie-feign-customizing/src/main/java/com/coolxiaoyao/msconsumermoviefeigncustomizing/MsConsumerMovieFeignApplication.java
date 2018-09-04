package com.coolxiaoyao.msconsumermoviefeigncustomizing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * @author KerryZhang
 */
@EnableDiscoveryClient

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class MsConsumerMovieFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsConsumerMovieFeignApplication.class, args);
    }
}
