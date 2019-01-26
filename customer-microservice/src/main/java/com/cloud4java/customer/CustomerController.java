package com.cloud4java.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/customer/v1/base")
public class CustomerController {
	private Logger log = LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(path = "/get")
	public void searchCustommer() {
		log.info("Entering get method.....");
		ResponseEntity<String> entity = restTemplate.getForEntity("http://jsonplaceholder.typicode.com/todos/1", String.class);
		
		log.info("Entering get method.....{}: ", entity);
	}
}
