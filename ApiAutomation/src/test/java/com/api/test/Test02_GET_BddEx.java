package com.api.test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Test02_GET_BddEx {
	
@Test
	
	void test_01() {
	
	given().
		get("https://reqres.in/api/users?page=2").
	then()
		.statusCode(200).

	    body("data.id[0]", equalTo(7)). /// Check in under response body/ data array / index 0
	    
	    body("data.first_name", hasItems("Michael", "Lindsay"))  ///Verify the values  
	    
	    .log().all();  //Print the logs
}
 
}
