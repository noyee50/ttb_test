package com.ttb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ttb.model.User;

@RestController
@RequestMapping("/v1")
public class GetUser {
	
	// Test 3 เขียนโปรแกรม Request ไปที่ https://localhost/v1/getCustomer เพื่อนำ customer name ไปแสดงผล
	@GetMapping("/getUser")
	public ResponseEntity<String> CustomerName() {
		RestTemplate restTemplate = new RestTemplate();
		User user = new User();
		user.setCustomerId("X101");
		String url = "http://localhost:8080/v1/getCustomer";
		ResponseEntity<User> response = restTemplate.postForEntity(url, user, User.class);
		return new ResponseEntity<String>(response.getBody().getCustomerName(), HttpStatus.OK);
	}
	
	//4. มีวิธีการตรวจสอบโปรแกรมของคุณ หรือการทำ Unit test อย่างไร **ทำ Login และทำ unit Test  ดูที่ ->>> Application Test
	

}
