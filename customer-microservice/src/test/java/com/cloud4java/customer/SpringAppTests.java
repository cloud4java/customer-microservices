package com.cloud4java.customer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAppTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void onlineTest() {
		RestTemplate restTemplate = Mockito.mock(RestTemplate.class);
		ResponseEntity<String> responseType;
//		Mockito.when(restTemplate.getForEntity("", String.class)).then(ResponseEntity.ok(new ResponseEntity<String>("{\"name\":\"Dorival\"}"),HttpStatus.SC_OK));
		restTemplate.getForEntity("", String.class);
	//	https://jsonplaceholder.typicode.com/todos/1
	}
}
