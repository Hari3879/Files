package coom.ojas.dateException;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class InvalidDateFormatException extends RuntimeException {
	public String msg;
	
	   public InvalidDateFormatException(String msg) {
		super(msg);
		
	}	   
}