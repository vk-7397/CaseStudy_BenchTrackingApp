package com.cg.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@Value(value="${data.exception.msg}")
	private String msg;
	
	@ExceptionHandler(value=EmployeeDataAlreadyExistsException.class)
	public ResponseEntity<String> EmployeeDataAlreadyExistsException(EmployeeDataAlreadyExistsException edae)
	{
		return new ResponseEntity<String>(msg,HttpStatus.CONFLICT);
	}
	
	@Value(value="${data.exception.dataNotFound}")
	private String dataNotFound;
	
	@ExceptionHandler(value=EmployeeIdNotFound.class)
	public ResponseEntity<String> EmployeeIdNotFound(EmployeeIdNotFound einf)
	{
		return new ResponseEntity<String>(dataNotFound,HttpStatus.CONFLICT);
	}

}


