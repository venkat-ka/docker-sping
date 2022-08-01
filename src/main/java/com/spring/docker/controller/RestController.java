package com.spring.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping(method = RequestMethod.GET, value = "/", headers = "Accept=*/*")
	public String getHome() {
		return "Hello World";
	}
}
