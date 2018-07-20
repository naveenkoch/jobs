package com.naveen.jobs.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naveen.jobs.model.User;
import com.naveen.jobs.model.enums.Role;
import com.naveen.jobs.service.SecurityService;
import com.naveen.jobs.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@Autowired
	private SecurityService securityService;

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String registration(Model model) {
		final List<Role> roles = Arrays.asList(Role.values());
		model.addAttribute("user", new User());
		model.addAttribute("roles", roles);
		return "signup";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String registration(@ModelAttribute("user") User user, Model model) {
		userService.save(user);
		securityService.autologin(user.getUsername(), user.getPassword());
		return "index";
	}

	@RequestMapping(value = "/rest", method = RequestMethod.GET,  produces = "application/json")
	public String restTest() {
		return "index";
	}

	@GetMapping("/")
	public String root(Model model) {
		Object currentUser = getCurrentUser();
		if (currentUser instanceof org.springframework.security.core.userdetails.User) {
			final org.springframework.security.core.userdetails.User principal = (org.springframework.security.core.userdetails.User) currentUser;
			final String name = principal.getUsername();
			final User user = userService.findByUsername(name);
			model.addAttribute("user", user);
			if (Role.EMPLOYEE.equals(user.getRole()))
				return "employee";
			else
				return "employer";
		}
		return "index";

	}

	private Object getCurrentUser() {
		return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}

	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
