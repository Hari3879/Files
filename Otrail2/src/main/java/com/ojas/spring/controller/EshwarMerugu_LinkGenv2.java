package com.ojas.spring.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EshwarMerugu_LinkGenv2 {
	private String result = "";

	@GetMapping("/api/linkgenv2/welcome")
	public Map encode() throws UnknownHostException {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
		String current_date = now.format(formatter);
		System.out.println(current_date);
		InetAddress localhost = InetAddress.getLocalHost();
		String ip = localhost.getHostAddress().trim();
		HashMap<Object, Object> map = new HashMap<>();
		map.put("message :", "Welcome User Linkgenv2 Demo");
		char ch = current_date.charAt(2);
		result = result + ch;
		int num1 = Integer.parseInt(result);
		for (int i = 0; i <= 10; i++) {
			result += num1 * i;
		}
		HashMap<Object, Object> url = new HashMap<>();
		for (int i = 1; i < 4; i++) {
			url.put("e" + i, "http://" + ip + ":2031/api/linkgenv2/encode/" + (844 + i));
		}
		for (int i = 1; i < 4; i++) {
			url.put("d" + i, "http://" + ip + ":2031/api/linkgenv2/decode/" + "4l6l" + result.substring(0, 6)
					+ (844 + i) + result.substring(6));
		}
		map.put("menu", url);
		return map;
	}

	@GetMapping("/api/linkgenv2/encode/{num}")
	public String encode(@PathVariable("num") String num) {
		System.out.println(result);
		String output = "4l6l" + result.substring(0, 6) + num + result.substring(6);
		return output;
	}

	@GetMapping("api/linkgenv2/decode/{num}")
	public String decode(@PathVariable String num) {
		return num.substring(10, 13);

	}
	
}