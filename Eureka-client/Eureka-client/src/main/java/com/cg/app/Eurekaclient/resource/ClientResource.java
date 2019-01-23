package com.cg.app.Eurekaclient.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ClientResource {

	

	@GetMapping
	public String printingHello() {
		return "helloWorld";
	}
}
