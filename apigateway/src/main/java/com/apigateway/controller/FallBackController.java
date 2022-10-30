package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@GetMapping("/userservicefallback")
	public String userServiceFallback() {
		return "user-service is down";
		
	}
	@GetMapping("/contactservicefallback")
	public String contactServiceFallback() {
		return "contact-service is down";
	}

}
