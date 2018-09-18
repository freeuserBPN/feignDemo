package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demosecond")
public class DemoSecondController {
	
	@GetMapping("/greeting")
	public String getGreetings() {
		return "greetings from demo-service-second";
	}

}
