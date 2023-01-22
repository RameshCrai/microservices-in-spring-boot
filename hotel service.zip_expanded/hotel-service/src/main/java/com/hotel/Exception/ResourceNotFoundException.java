package com.hotel.Exception;


@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException{

	ResourceNotFoundException(){
		super("Given hotel Id is not Avaiable here ?? ");
	}
	
	public ResourceNotFoundException(String msg){
		super(msg);
	}
}
