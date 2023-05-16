package com.ojas.utils;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {
	//@Value("${app.secrate}")
	private String secrate = "ojas";

	public String generateJwtToken(String subject) {
		return Jwts.builder().setSubject(subject).setIssuer("harikrishna")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(10)))
				.signWith(SignatureAlgorithm.HS512, secrate.getBytes()).compact();
	}
	public Claims getClaims(String token)
	{
		return Jwts.parser().setSigningKey(secrate.getBytes()).parseClaimsJws(token).getBody();
	}
//	public Claims getClaims(String token) {
//		System.out.println("hello claims");
//		return Jwts.parser().setSigningKey(secrate.getBytes()).parseClaimsJwt(token).getBody();
//
//	}

	public Date getExpDate(String token) {
		System.out.println("hello getcliam");
		System.out.println(token);
		return getClaims(token).getExpiration();

	}

	public String getUsername(String token) {
		System.out.println("*********************");
		System.out.println(getClaims(token));
		return "dgafsfhfrjhsg"+getClaims(token).getSubject();

	}

	public boolean isValidToken(String token) {
		Date expDate = getExpDate(token);
		return expDate.before(new Date(System.currentTimeMillis()));

	}

	public boolean validateToken(String token, String username) {
		String tokenUserName = getUsername(token);
		return (username.equals(tokenUserName) && !isValidToken(token));

	}
}
