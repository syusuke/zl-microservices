package com.coolxiaoyao.msconsumermovieribboncustomizing;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;


/**
 * @author Kerry on 18/09/04
 */


@Configuration
@RibbonClient(name = "microservice-provider-user", configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
