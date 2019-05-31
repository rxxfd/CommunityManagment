package com.xietong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.xietong.dao")
@SpringBootApplication
public class CommunitymanagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunitymanagmentApplication.class, args);
	}

}
