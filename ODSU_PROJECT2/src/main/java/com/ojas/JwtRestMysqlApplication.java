package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class JwtRestMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtRestMysqlApplication.class, args);
	}

}
