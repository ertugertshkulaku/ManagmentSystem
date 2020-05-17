package com.shkulaku.ManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shkulaku.ManagementSystem.entities.User;
import com.shkulaku.ManagementSystem.services.UserService;

@SpringBootApplication
public class ManagementSystemApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args)  {
		SpringApplication.run(ManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		{
			User newAdmin = new User("admin@mail.com", "Admin", "12345");
			userService.createAdmnin(newAdmin);
			
		}
		
	}
	
	

}
