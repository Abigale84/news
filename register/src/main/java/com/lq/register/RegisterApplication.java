package com.lq.register;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/8 15:13
 */
@EnableEurekaServer
@SpringCloudApplication
public class RegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterApplication.class,args);
    }
}