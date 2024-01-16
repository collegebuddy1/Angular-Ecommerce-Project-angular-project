package com.ezeeshop.rest;

public class CartExceptionClass extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public CartExceptionClass(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "CartExceptionClass [message=" + message + "]";
	}
	
	

}
