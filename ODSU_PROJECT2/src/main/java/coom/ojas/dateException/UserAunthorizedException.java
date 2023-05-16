package coom.ojas.dateException;

public class UserAunthorizedException extends RuntimeException {
	public String message;
	public UserAunthorizedException(String message ) {
		super(message);
	}
}
