package com.datatools.managerUsersData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ManagerUsersDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerUsersDataApplication.class, args);
	}

}
