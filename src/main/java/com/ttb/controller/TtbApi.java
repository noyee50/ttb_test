package com.ttb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttb.model.User;

@RestController
@RequestMapping("/v1")
public class TtbApi {
	
	@PostMapping("/getCustomer")
	public User requestMethodName(@RequestBody User user) {
		System.out.println(user.getCustomerId());
		User o = new User();
		o.setCustomerId("X101");
		o.setCustomerName("NAME TEST");
	    return o;
	}
	
}
