package com.ojas.excep;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.ObjectNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class ExceptionHandler {
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public Map<String, String> getEception(MethodArgumentTypeMismatchException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "date formate worng");

		return map;

	}
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler(IllegalArgumentException.class)
	public Map<String, String> getEception(IllegalArgumentException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "Somthing Went Worng");

		return map;

	}
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler(EmptyResultDataAccessException.class)
	public Map<String, String> getEception(EmptyResultDataAccessException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "You enterd user not available");

		return map;

	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler(ObjectNotFoundException.class)
	public Map<String, String> getEception(ObjectNotFoundException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "data not available");

		return map;

	}
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler(BadCredentialsException.class)
	public Map<String, String> getEception(BadCredentialsException ex) {

		Map<String, String> map = new HashMap<>();
		map.put("Error", "wrong credentials");

		return map;

	}
} 
