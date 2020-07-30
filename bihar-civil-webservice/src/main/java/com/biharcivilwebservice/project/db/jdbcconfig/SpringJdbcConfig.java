package com.biharcivilwebservice.project.db.jdbcconfig;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringJdbcConfig {
	
	@Value("${spring.datasource.driver-class-name}")
	String  jdbcDriverClass;
	
	@Value("${spring.datasource.url}")
	String  jdbcURL;
	
	@Value("${spring.datasource.username}")
	String  jdbcUsername;
	
	@Value("${spring.datasource.password}")
	String  jdbcPassword;
	
	
    @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(jdbcDriverClass);
        dataSource.setUrl(jdbcURL);
        dataSource.setUsername(jdbcUsername);
        dataSource.setPassword(jdbcPassword);
 
        return dataSource;
    }
}