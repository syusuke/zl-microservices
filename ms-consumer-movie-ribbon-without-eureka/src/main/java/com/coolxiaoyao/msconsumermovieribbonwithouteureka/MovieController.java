package com.coolxiaoyao.msconsumermovieribbonwithouteureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Kerry on 18/04/09
 */

@RestController
public class MovieController {

    private static Logger logger = LoggerFactory.getLogger(MovieController.class);

    private final RestTemplate restTemplate;
    private final LoadBalancerClient loadBalancerClient;


    @Autowired
    public MovieController(RestTemplateBuilder restTemplateBuilder,
                           LoadBalancerClient loadBalancerClient) {
        this.restTemplate = restTemplateBuilder.build();
        this.loadBalancerClient = loadBalancerClient;
    }

    /**
     * 不能将 restTemplate.getForObject() 和 loadBalancerClient.choose() 写在同一个方法中..
     *
     * @param id
     * @return
     */

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        final ServiceInstance choose = this.loadBalancerClient.choose("microservice-provider-user");
        logger.info("serviceId={}.host={}.port={}", choose.getServiceId(), choose.getHost(), choose.getPort());
        return this.restTemplate.getForObject("http://" + choose.getHost() + ":" + choose.getPort() + "/" + id, User.class);
    }

    /**
     * 不能将 restTemplate.getForObject() 和 loadBalancerClient.choose() 写在同一个方法中..
     */
    @GetMapping("/log-instance")
    public void logUserInstance() {
        final ServiceInstance choose = this.loadBalancerClient.choose("microservice-provider-user");
        logger.info("serviceId={}.host={}.port={}", choose.getServiceId(), choose.getHost(), choose.getPort());

    }


}
