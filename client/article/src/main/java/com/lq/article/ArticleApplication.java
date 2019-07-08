package com.lq.article;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/8 15:39
 */
@SpringCloudApplication
@ComponentScan(basePackages = "com.lq")
public class ArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleApplication.class,args);
    }
}
