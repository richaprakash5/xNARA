package com.xnara.project.xnara.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jayway.jsonpath.JsonPath;

@RestController
@RequestMapping("/xnara")
public class XnaraController {
	
	@GetMapping("/{customer_id}")
	public Object getPack1(@PathVariable int customer_id) {
		
		String url = "https://6466e9a7ba7110b663ab51f2.mockapi.io/api/v1/pack1";
		RestTemplate restTemplate = new RestTemplate();
		Object[] pack1 = restTemplate.getForObject(url, Object[].class);
		System.out.println(pack1[0]);
		return pack1[0];
	}

}
