package com.facebook.whatsapp;

public class InvalidPhoneException extends Exception {

	public InvalidPhoneException() {
		super();
	}

	public InvalidPhoneException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidPhoneException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidPhoneException(String message) {
		super(message);
	}

	public InvalidPhoneException(Throwable cause) {
		super(cause);
	}

}
