package com.enterprise.EnterpriseAPP;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnterpriseAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseAppApplication.class, args);
	}

	final UserService userService ;
	public EnterpriseAppApplication(UserService userService) {
		this.userService = userService ;
	}


	// This method runs , when everything loads , execution and all the things to run a project loads up
	@Override
	public void run(String... args) throws Exception {
      userService.saveUser("Aryan");

	}
}
