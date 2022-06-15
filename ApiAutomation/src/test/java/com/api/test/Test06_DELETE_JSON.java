package com.api.test;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class Test06_DELETE_JSON {
	
	@Test
	public void test_delete_01() {
		

		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).
			log().all();
		
	}

}
