package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class endpoint1{

	
	@RequestMapping("/mypage")
	public String mystring ()
	{
		return "first message";
	}
	
	@RequestMapping("/second")
	public String sayHello (@RequestParam String name)
	{
		return "welcome:" + name;
	}
	
	@RequestMapping(path = "/pathvarexample/{name}")
	public String sayHello2(@PathVariable String name)
	{
		return "path definition:" + name;	
	}
	
	@GetMapping(path = "/secondSampleBean") 
	public secondSampleBean secondBean(){
		return new secondSampleBean ("for oracle india");
	}
}
