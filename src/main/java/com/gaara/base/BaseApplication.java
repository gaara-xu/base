package com.gaara.base;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Date;

@SpringBootApplication
@MapperScan(basePackages = "com.gaara.base.mapper")
@Slf4j
public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(BaseApplication.class);
        Environment environment = application.run(args).getEnvironment();
        log.info("\n--------------------------------base-------------------------------------\n\t" +
                        "Application '{}' is running! \n\t" +
                        "Now is 【{}】\n\t"+
                        "Url is : 【'http://localhost:{}'】\n\t"+
                        "Mysql url : 【{}】\n\t"
                ,
                environment.getProperty("spring.profiles.active") == null ? "OnLine":environment.getProperty("spring.profiles.active"),
                JSONObject.toJSONStringWithDateFormat(new Date(),"yyyy-MM-dd hh:mm:ss"),
                environment.getProperty("server.port"),
                environment.getProperty("spring.datasource.url")
        );
        System.out.print("---------------------------------------------------------------------------\n\t");
    }
}
