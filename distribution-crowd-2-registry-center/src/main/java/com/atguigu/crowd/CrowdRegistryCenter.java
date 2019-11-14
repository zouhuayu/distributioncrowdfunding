package com.atguigu.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zouhuayu
 * 2019-11-09-12:29
 */
@EnableEurekaServer
@SpringBootApplication
public class CrowdRegistryCenter {

    public static void main(String[] args) {
        SpringApplication.run(CrowdRegistryCenter.class, args);
    }

}
