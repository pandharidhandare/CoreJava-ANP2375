package com.ipl.cricket.sb.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(PlayerNotFoundException.class)
	public ResponseEntity<ErrorMessage> handlePlayerException
	(PlayerNotFoundException excep,WebRequest request){
		ErrorMessage errorMessage=new ErrorMessage
				(HttpStatus.NOT_FOUND,excep.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
	}
	
	@ExceptionHandler(MatchNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleBookingException
	(MatchNotFoundException ex, WebRequest request) {
	ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());	
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
}
