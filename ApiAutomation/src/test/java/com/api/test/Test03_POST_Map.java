package com.api.test;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test03_POST_Map {
	
	@Test
	public void test_post01() {
		Map<String, Object> map = new HashMap<String, Object>();  ///Using Map
		map.put("name", "morpheus");
		map.put("job", "leader");
		
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		
		System.out.println(request);
		System.out.println(request.toJSONString());

	}

}
