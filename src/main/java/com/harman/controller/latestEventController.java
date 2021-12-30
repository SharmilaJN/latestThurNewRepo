package com.harman.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class latestEventController {
	
	@GetMapping(value="/message")
	public String getMessage() {
		return "This is message from webapp in new workspace deployed on Azure!!!!!";
	}
	

}
