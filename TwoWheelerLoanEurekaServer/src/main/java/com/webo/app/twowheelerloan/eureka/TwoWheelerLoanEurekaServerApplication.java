package com.webo.app.twowheelerloan.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class TwoWheelerLoanEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoWheelerLoanEurekaServerApplication.class, args);
	}

}
