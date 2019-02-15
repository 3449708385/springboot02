package com.mgp.startItem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages="com.mgp.*.*dao")
//@EnableConfigurationProperties(value = { DBConfigOne.class, DBConfigTwo.class })
public class SpringBootStartItem {

	public static void main(String[] args) {
        SpringApplication.run(SpringBootStartItem.class, args);
	}

}
