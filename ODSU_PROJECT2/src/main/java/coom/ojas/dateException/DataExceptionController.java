package coom.ojas.dateException;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
//@RestControllerAdvice
public class DataExceptionController  {
	@ExceptionHandler(InvalidDateFormatException.class)
    public ResponseEntity<Object> handleInvalidDateFormatException(InvalidDateFormatException ex) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Invalid date format. Please provide the date in YYYY-MM-DD format.");
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    
        
	}
}


