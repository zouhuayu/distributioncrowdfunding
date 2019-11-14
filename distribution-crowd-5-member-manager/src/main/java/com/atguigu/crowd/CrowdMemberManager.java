package com.atguigu.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zouhuayu
 * 2019-11-09-15:28
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CrowdMemberManager {

    public static void main(String[] args) {
        SpringApplication.run(CrowdMemberManager.class, args);
    }

}