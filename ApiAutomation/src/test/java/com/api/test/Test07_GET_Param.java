package com.api.test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test07_GET_Param {
	
	@Test
	public void test_GET01() {
	
	baseURI = "https://reqres.in/api";
	
	given().
	param("id", 8).    ///To Pass Parameters
	
	when().
	get("/users").
	
	then().
	statusCode(200).
	log().all();
	
	}

}
