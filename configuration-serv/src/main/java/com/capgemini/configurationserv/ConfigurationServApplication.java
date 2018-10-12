package com.capgemini.configurationserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigurationServApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationServApplication.class, args);
	}
}
