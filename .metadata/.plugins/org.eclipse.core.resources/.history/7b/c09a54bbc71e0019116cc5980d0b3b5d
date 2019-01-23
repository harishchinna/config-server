package com.cg.app.WebSite.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HelloResource {
	
	@Autowired
	private RestTemplate restTemplate;
	 
	
	@RequestMapping
	public String gettingHelloWorld(Model model)
	{
		ResponseEntity<String> entity = restTemplate.getForEntity("http://hello-service", String.class);
		String message =  entity.getBody();
		System.out.println(message);
		model.addAttribute("message", message);
		return "helloWorld";
	}
}
