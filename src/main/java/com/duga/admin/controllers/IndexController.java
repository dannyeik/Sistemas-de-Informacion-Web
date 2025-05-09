package com.duga.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "index.html";
	}
	
	@GetMapping("/error")
	public String error() {
		return "error.html";
	}
}
