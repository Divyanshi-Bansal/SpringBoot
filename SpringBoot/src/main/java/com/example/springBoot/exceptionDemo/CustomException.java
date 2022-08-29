package com.example.springBoot.exceptionDemo;

//blog not found exception
public class CustomException extends RuntimeException{

	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomException(String message) {
		super(message);
		System.out.println("message :: "+message);
	}

	public CustomException(Throwable cause) {
		super(cause);
	}
	
}
