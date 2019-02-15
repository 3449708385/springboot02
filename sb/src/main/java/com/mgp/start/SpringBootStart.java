package com.mgp.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.mgp.datasource.beans.DBConfigOne;
import com.mgp.datasource.beans.DBConfigTwo;

@EnableAutoConfiguration
//@ComponentScan(basePackages="com.mgp.*")
@SpringBootApplication
@MapperScan(basePackages="com.mgp.*.*dao")
@EnableConfigurationProperties(value = { DBConfigOne.class, DBConfigTwo.class })
public class SpringBootStart {

	public static void main(String[] args) {
        SpringApplication.run(SpringBootStart.class, args);
	}

}
