package com.atguigu.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zouhuayu
 * 2019-11-11-15:49
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class CrowdProjectManager {

    public static void main(String[] args) {
        SpringApplication.run(CrowdProjectManager.class, args);
    }

}