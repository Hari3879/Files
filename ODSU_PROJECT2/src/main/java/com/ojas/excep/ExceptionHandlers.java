package com.ojas.excep;

import java.util.HashMap;
import java.util.Map;
import org.hibernate.ObjectNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import coom.ojas.dateException.UserAunthorizedException;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;

@RestControllerAdvice
public class ExceptionHandlers extends Exception {
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(Exception.class)
//	public Map<String, String> getEception(Exception ex) {
//
//		Map<String, String> map = new HashMap<>();
//		map.put("Error", "please check again");
//
//		return map;
//
//	}
	
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public Map<String, String> getEception(MethodArgumentTypeMismatchException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "date formate worng");

		return map;

	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(IllegalArgumentException.class)
	public Map<String, String> getEception(IllegalArgumentException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "dates are reversed");

		return map;

	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public Map<String, String> getEception(EmptyResultDataAccessException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "You enterd user not available");

		return map;

	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ObjectNotFoundException.class)
	public Map<String, String> getEception(ObjectNotFoundException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "data not available");

		return map;

	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(BadCredentialsException.class)
	public Map<String, String> getEception(BadCredentialsException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "wrong credentials");

		return map;

	}

	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	 @ExceptionHandler(UserAunthorizedException.class)
	public Map<Integer, String> getEception() {
		Map<Integer, String> map = new HashMap<>();
		map.put(401, "User UnAuthorized");
		return map;
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler(AuthenticationCredentialsNotFoundException.class)
	public Map<String, String> getEception(AuthenticationCredentialsNotFoundException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "somthing went wrong");

		return map;

	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler(AccessDeniedException.class)
	public Map<String, String> getEception(AccessDeniedException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "somthing went wrong");

		return map;

	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler(ExpiredJwtException.class)
	public Map<String, String> getEception(ExpiredJwtException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "somthing went wrong");

		return map;

	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler(InternalAuthenticationServiceException.class)
	public Map<String, String> getEception(InternalAuthenticationServiceException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "somthing went wrong");

		return map;

	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler(HttpMessageNotReadableException.class)
	public Map<String, String> getEception(HttpMessageNotReadableException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "Add required fields");

		return map;

	}
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler(SignatureException.class)
	public Map<String, String> getEception(SignatureException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "Add required fields");

		return map;

	}

}
