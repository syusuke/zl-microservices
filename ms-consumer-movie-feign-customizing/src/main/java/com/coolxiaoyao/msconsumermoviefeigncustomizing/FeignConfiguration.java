package com.coolxiaoyao.msconsumermoviefeigncustomizing;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kerry on 18/09/04
 * <p>
 * <p>
 * feign 配置类,
 * <p>
 * 这个类,不应该在应用程序上下文@ComponentScan中
 */


@Configuration
public class FeignConfiguration {

    @Bean
    public Contract feignContract() {
        return new Contract.Default();
    }

}
