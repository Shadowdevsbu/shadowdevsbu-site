package com.shadowdevs.platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/projects")
	public String projects() {
		return "projects";
	}

	@GetMapping("/contact")
	public String  contact() {
		return "contact";
	}
	
}
