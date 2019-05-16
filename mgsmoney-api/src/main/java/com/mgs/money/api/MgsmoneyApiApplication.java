package com.mgs.money.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.mgs.money.api.config.property.MgsmoneyApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(MgsmoneyApiProperty.class)
public class MgsmoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MgsmoneyApiApplication.class, args);
	}

}
