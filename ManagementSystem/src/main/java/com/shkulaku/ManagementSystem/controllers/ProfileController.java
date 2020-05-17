package com.shkulaku.ManagementSystem.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.shkulaku.ManagementSystem.entities.User;
import com.shkulaku.ManagementSystem.services.TaskService;
import com.shkulaku.ManagementSystem.services.UserService;

@Controller
public class ProfileController {
	
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/profile")
	public String showProfilePage(Model model, Principal principal) {
		String email = principal.getName();
		User user = userService.findOne(email);
		model.addAttribute("tasks", taskService.findUserTask(user));
		return "view/profile";
	}
	

}
