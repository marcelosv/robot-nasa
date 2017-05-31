package com.br.marcelo.robotnasa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionMapper {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(InvalidCommandReceiveException.class)
	public String handleInvalidCommandReceiveException(InvalidCommandReceiveException ex) {
		return ex.getMessage();
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MovingInvalidException.class)
	public String handleMovingInvalidException(MovingInvalidException ex) {
		return ex.getMessage();
	}
	
}
