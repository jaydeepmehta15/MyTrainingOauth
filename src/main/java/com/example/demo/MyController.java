package com.example.demo;

import java.security.Principal;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/")
	public String sayHello(@AuthenticationPrincipal Principal principal) {
		
		return "<h1> Hello Wipro </h1>"
				+ "<p>" + principal + "</p>";
		
	}
	
	
}
