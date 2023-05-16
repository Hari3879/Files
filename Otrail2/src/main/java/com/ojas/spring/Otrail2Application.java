package com.ojas.spring;

import javax.print.DocFlavor.STRING;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Otrail2Application {

	public static void main(String[] args) {
		SpringApplication.run(Otrail2Application.class, args);

		int num = 8;
		String value = "4lel";
		int mul;
		String s = "";
		for (int i = 0; i <= 10; i++) {
			mul = (num * i);
			s += mul;
		}
		System.out.println();
		String h = s.substring(0, 5) + "845" + s.substring(5, 19);
		System.out.println(h);
		System.out.println(h.substring(5, 8));
	}

}
