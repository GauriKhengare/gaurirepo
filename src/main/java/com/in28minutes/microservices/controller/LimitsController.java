package com.in28minutes.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.bean.Limits;
import com.in28minutes.microservices.configuration.Configuration;

@RestController
public class LimitsController {
	@Autowired
	private Configuration configuration;
	 
	@GetMapping("/limits")
	public Limits RetrieveLimits()
	{
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
		//return new Limits(1,1000);
	}
}
