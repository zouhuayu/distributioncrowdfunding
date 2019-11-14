package com.atguigu.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zouhuayu
 * 2019-11-09-15:08
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CrowdRedisProvider {

    public static void main(String[] args) {
        SpringApplication.run(CrowdRedisProvider.class, args);
    }

}
