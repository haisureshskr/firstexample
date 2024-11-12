package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("oracleprops")

public class Exampleproperties {
	
	public Exampleproperties() {
		
		
	}
	
	private String greeting = "thank you";
	
	public String getgreeting() {
		return greeting;
	}

	public void setgreeting(String greeting) {
		this.greeting = greeting;
	}	
}
