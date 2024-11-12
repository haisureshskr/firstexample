package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class endPoint3 {
	
	public endPoint3() {
		
		
	}

	@Autowired
	Exampleproperties props;
	
	@RequestMapping("/greetothers")
	public String greet(@RequestParam String details) {
		return props.getgreeting() + ":" + details;
		
	}
	
	
}
