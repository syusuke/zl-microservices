package com.coolxiaoyao.msconsumermoviefeigncustomizing;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author Kerry on 18/09/04
 */

@FeignClient(name = "microservice-provider-user", configuration = FeignConfiguration.class)
public interface UserFeignClient {

    /**
     * 使用Feign自带的注解
     *
     * @param id
     * @return
     */

    @RequestLine("GET /{id}")
    User findById(@Param("id") Long id);

}
