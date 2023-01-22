package com.micro_user.exception;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException(){
		super("Resource not Found Exception ");
	}
	
	public ResourceNotFoundException(String message){
		super(message);
	}

}
