package com.ojas.spring.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Harikrishna_LinkGen {
	
	
	public String encode(int i) {
		Random random = new Random(); 
		int num=random.nextInt(10000);
		
		
		String s=String.valueOf(num);
		String s1=s.concat(""+i);
		
		
		
		return s1;
		
	}
	@GetMapping("/LinkGen/Welcome")
	public String Display() throws UnknownHostException {

		InetAddress localhost = InetAddress.getLocalHost();
		String ip = localhost.getHostAddress();
		
		int port = 2021;

		JSONObject obj = new JSONObject();
		JSONObject data = new JSONObject();
		obj.put("msg", "Welcome User");
		for (int i = 1; i < 4; i++) {
			data.put("m" + i, "http://" + ip + ":" + port + "/api/LinkGen/Welcome/" + encode(i));
		}
		obj.put("menu", data);
		String jsonString = obj.toString();

		return jsonString;

	}

	@GetMapping("/LinkGen/Welcome/{Num}")
	public Map<String, String> results(@PathVariable String Num) {
		
		String res = Num.substring(4);
		Map<String, String> map = new HashMap<String, String>();
		map.put("results", res);
		
	
		return map;
	}
	
	

}