package com.gaara.base.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Gaara_Xu
 * on 2022/7/3.
 */
@Component
@Slf4j
public class SystemParameterInitialization implements ApplicationRunner {

    @Autowired
    private RedisOperator redisOperator;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        redisOperator.set("someThing","");
        redisOperator.del("someThing");
        log.info("Os Name: {}", System.getProperty("os.name"));
        log.info("Redis Clean up !!");
    }
}
