package com.stackroute.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MuzixApplicationTrack {

	public static void main(String[] args) {
		SpringApplication.run(MuzixApplicationTrack.class, args);
	}

}

