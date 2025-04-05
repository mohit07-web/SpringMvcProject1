package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("new")
public class NewController {
		@RequestMapping("/")
		public String getResponce() {
			System.out.println("WelcomeController.getResponce()");
			return "newversion";
		}

		@RequestMapping("/start")
		public String getoutput() {
			System.out.println("WelcomeController.getoutput()");
			return "welcome";
		}
	}
