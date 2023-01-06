package com.mvs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan({"com.mvs.*"})
@EnableJpaRepositories({"com.mvs.repository.*"})
public class MovieManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieManagementSystemApplication.class, args);
	}
}
