package com.api.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Test01_GET_WithoutRestA {
	
	@Test
	
	void test_02() {
		//No Need of RestAssured as we have added //import static io.restassured.RestAssured.*;
		// Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		Response response = get("https://reqres.in/api/users?page=2");
		 
		 System.out.println(response.asString());
		 System.out.println(response.getBody().asString());
		 System.out.println(response.getStatusCode());
		 System.out.println(response.getStatusLine());
		 System.out.println(response.getHeader("Content_Type"));
		 System.out.println(response.getTime());
		 
		 int StatusCode = response.getStatusCode();
		 
		 // Assert.assertEquals(StatusCode, 201); //will fail
		 Assert.assertEquals(StatusCode, 200); //Will Pass

}

}
