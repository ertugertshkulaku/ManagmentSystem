package com.shkulaku.ManagementSystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String showIndexPage() {
		return "index";
	}
	@GetMapping("/login") 
	public String showLoginForm() {
		
		return "view/loginForm";  
	}

}
