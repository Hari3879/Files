package coom.ojas.dateException;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class UserExceptionController  {
	@ExceptionHandler(UserAunthorizedException.class)
    public ResponseEntity<Object> UserAunthorizedException(UserAunthorizedException ex) {
        Map<Integer, String> body = new LinkedHashMap<>();
       
        body.put(401, "You are not authorized to access this resource");
        return new ResponseEntity<>(body, HttpStatus.UNAUTHORIZED);
    
        
	}
}



