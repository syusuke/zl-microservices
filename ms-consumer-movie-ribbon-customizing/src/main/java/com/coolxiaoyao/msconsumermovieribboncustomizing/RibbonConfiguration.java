package com.coolxiaoyao.msconsumermovieribboncustomizing;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kerry on 18/09/04
 */

@Configuration
public class RibbonConfiguration {


    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }

}
