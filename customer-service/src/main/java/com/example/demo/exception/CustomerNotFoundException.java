package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomerNotFoundException extends RuntimeException {
	
	private long serialID = 983492392492322l;
	private String message;
	
	public CustomerNotFoundException(String message) {
		this.message = message;
	}
	

}
