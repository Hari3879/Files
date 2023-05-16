package com.ojas.utils;

import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {
	//@Value("${my.app.jwtSecret}")
	private String secrate="ojas";
	
	 //@Value("${my.app.jwtExpirationMs}")
	    private int expirationInMs=86400000;

	public String generateJwtToken(String subject) {
		return Jwts.builder().setSubject(subject).setIssuer("Pravalika")
				
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(10)))
				.signWith(SignatureAlgorithm.HS512, secrate.getBytes()).compact();
	}

	public Claims getClaims(String token) {
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
		return getClaims(token).getSubject();

	}
	
	
	public List<String> getRolesFromToken(String token) {
	    Claims claims = Jwts.parser().setSigningKey(secrate.getBytes()).parseClaimsJws(token).getBody();
	    List<String> roles = claims.get("roles", List.class);
	    if (roles == null) {
	        roles = new ArrayList<>();
	    }
	    return roles;
	}

	public boolean isValidToken(String token) {
		Date expDate = getExpDate(token);
		return expDate.before(new Date(System.currentTimeMillis()));

	}

	public boolean validateToken(String token, String username) {
		String tokenUserName = getUsername(token);
		return (username.equals(tokenUserName) && !isValidToken(token));

	}
	
	public String generateToken(org.springframework.security.core.Authentication authenticate,String subject) {
        UserPrincipal userPrincipal = (UserPrincipal) authenticate.getPrincipal();

        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + expirationInMs);

        return Jwts.builder()
        		.setSubject(subject)
                .setIssuer("Pravalika")
                .claim("roles", ((org.springframework.security.core.Authentication) userPrincipal).getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .setIssuedAt(new Date())
                .setExpiration(expiryDate)
                .signWith(SignatureAlgorithm.HS512, secrate.getBytes()).compact();         
    }
	
}
