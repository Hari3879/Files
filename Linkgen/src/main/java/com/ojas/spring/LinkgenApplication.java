package com.ojas.spring;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LinkgenApplication {

	public static void main(String[] args) throws UnknownHostException {
		SpringApplication.run(LinkgenApplication.class, args);
//		JSONObject obj=new JSONObject();
//		JSONObject data=new JSONObject();
//		obj.put("msg", "welcome user");
//
//
//		for(int i=1;i<4;i++) {
//			data.put("m1","http://ur_ip:ur_app_port/api/linkgen/welcome/"+i);
//			System.out.println(data);
//		}
//    System.out.println(obj);
		InetAddress localhost = InetAddress.getLocalHost();
		System.out.println(localhost);
		  String ip=localhost.getHostAddress();
		System.out.println(ip);
		int i = 0;
		Random random = new Random(); 
		int num=random.nextInt(10000);
		System.out.println("random number");
		System.out.println(num);
		String s=String.valueOf(num);
		String s1=s.concat(""+i);
		System.out.println(s1);
		String s2=s1.substring(4);
		System.out.println(s2);
		  
	}

}
