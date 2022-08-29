package com.example.springBoot.exceptionDemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BlogGlobalExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<BlogErrorResponse> handleException(Exception exe){
		BlogErrorResponse errorResponse = new BlogErrorResponse();
		errorResponse.setMessage("handler "+exe.getMessage());
		errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}

}
