package com.coolxiaoyao.msconsumermoviefeigncustomizing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kerry on 18/04/09
 */

@RestController
public class MovieController {
    private final UserFeignClient userFeignClient;

    public MovieController(UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
    }


    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return userFeignClient.findById(id);
    }


}
