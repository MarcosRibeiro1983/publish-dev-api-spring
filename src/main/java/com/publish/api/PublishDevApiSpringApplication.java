package com.publish.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class PublishDevApiSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublishDevApiSpringApplication.class, args);
	}


//	@Bean
//	public DataSource dataSource(){
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("org.postgresql.Driver");
//		dataSource.setUrl("jdbc:postgresql://postgres.railway.internal:5432/railway");
//		dataSource.setUsername("postgres");
//		dataSource.setPassword("rHcfFaRUCTamnkghGtGTplhVlTZzsaUb");
//		return dataSource;
//	}


}

