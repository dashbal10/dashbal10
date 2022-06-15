package com.api.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test00_GET {
	
	@Test
	
	void test_01() {
		
		 Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		 
		 System.out.println(response.asString());
		 System.out.println(response.getBody().asString());
		 System.out.println(response.getStatusCode());
		 System.out.println(response.getStatusLine());
		 System.out.println(response.getHeader("Content_Type"));
		 System.out.println(response.getTime());
		 
		 int StatusCode = response.getStatusCode();
		 
		 // Assert.assertEquals(StatusCode, 201);
		 Assert.assertEquals(StatusCode, 200); //Will Pass
	}

}
