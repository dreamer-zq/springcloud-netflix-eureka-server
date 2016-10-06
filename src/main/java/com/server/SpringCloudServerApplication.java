package com.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringCloudServerApplication.class).web(true).run(args);
	}
	
}
