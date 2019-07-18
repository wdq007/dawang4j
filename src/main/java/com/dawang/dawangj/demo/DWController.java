package com.dawang.dawangj.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DWController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Bob";
	}
	

}
