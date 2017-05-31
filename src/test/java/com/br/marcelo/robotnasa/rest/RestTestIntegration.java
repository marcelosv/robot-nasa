package com.br.marcelo.robotnasa.rest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.br.marcelo.robotnasa.RobotNasaApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@ComponentScan(basePackageClasses=RobotNasaApplication.class)
public class RestTestIntegration {

	@Autowired
    private TestRestTemplate restTemplate;
	
	@Test 
	public void
	testCommand1(){
		ResponseEntity<String> returnPosition = this.restTemplate.postForEntity("/rest/mars/MMRMMRMM", null, String.class);
		Assert.assertEquals("(2, 0, S)", returnPosition.getBody());
	}
	
	@Test 
	public void
	testCommand2(){
		ResponseEntity<String> returnPosition = this.restTemplate.postForEntity("/rest/mars/MML", null, String.class);
		Assert.assertEquals("(0, 2, W)", returnPosition.getBody());
	}
	
	@Test 
	public void
	testCommand3WithError(){
		ResponseEntity<String> returnPosition = this.restTemplate.postForEntity("/rest/mars/AAA", null, String.class);
		Assert.assertEquals(HttpStatus.BAD_REQUEST, returnPosition.getStatusCode());
	}
	
	@Test 
	public void
	testCommand4WithError(){
		ResponseEntity<String> returnPosition = this.restTemplate.postForEntity("/rest/mars/MMMMMMMMMMMMMMMMMMMMMMMM", null, String.class);
		Assert.assertEquals(HttpStatus.BAD_REQUEST, returnPosition.getStatusCode());
	
	}
}
