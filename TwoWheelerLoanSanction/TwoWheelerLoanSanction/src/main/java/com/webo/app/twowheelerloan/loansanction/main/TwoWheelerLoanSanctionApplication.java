package com.webo.app.twowheelerloan.loansanction.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TwoWheelerLoanSanctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoWheelerLoanSanctionApplication.class, args);
	}
	
	@Bean
	public RestTemplate rstemp()
	{
		RestTemplate rs=new RestTemplate();
		return rs;
	}
}
