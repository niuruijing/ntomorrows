package com.tomorrow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.tomorrow.mapper")
public class SprintbootNtomorrowApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SprintbootNtomorrowApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SprintbootNtomorrowApplication.class, args);
	}
}
