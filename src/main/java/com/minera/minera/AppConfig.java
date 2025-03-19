package com.minera.minera;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:database.properties")
@ComponentScan("com.minera.minera")
public class AppConfig {

	@Autowired
	Environment enviroment;
	
	@Bean
	DataSource dataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName(enviroment.getProperty("driver"));
		dmds.setUrl(enviroment.getProperty("url"));
		dmds.setUsername(enviroment.getProperty("dbUser"));
		dmds.setPassword(enviroment.getProperty("dbPassword"));
		return dmds;
	}
	
}

