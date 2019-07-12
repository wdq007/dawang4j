package com.dawang.dawangj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WechatMessageDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WechatMessageDemoApplication.class, args);
	}

}