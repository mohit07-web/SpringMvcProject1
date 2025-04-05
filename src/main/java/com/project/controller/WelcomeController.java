package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("f1")
public class WelcomeController {
	@RequestMapping("/")
	public String getResponce() {
		System.out.println("WelcomeController.getResponce()");
		return "hello";
	}

	@RequestMapping("/start")
	public String getoutput() {
		System.out.println("WelcomeController.getoutput()");
		return "welcome";
	}

}