package com.fastcampus.board_admin_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class BoardAdminProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardAdminProjectApplication.class, args);
	}

}
