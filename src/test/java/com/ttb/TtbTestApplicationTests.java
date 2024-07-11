package com.ttb;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.ttb.model.User;

@SpringBootTest
class TtbTestApplicationTests {

	@Test
	void contextLoads() {
	}
	
	//4. มีวิธีการตรวจสอบโปรแกรมของคุณ หรือการทำ Unit test อย่างไร ** Use Application Test
	@Test
	void testAPI() throws IOException{
		RestTemplate restTemplate = new RestTemplate();
		User user = new User();
		user.setCustomerId("X101");
		String url = "http://localhost:8080/v1/getCustomer";
		ResponseEntity<User> response = restTemplate.postForEntity(url, user, User.class);
		 
		Assertions.assertEquals(response.getBody().getCustomerName(), "NAME TEST");
	}

}
