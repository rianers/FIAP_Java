package com.facebook.whatsapp;

public class InvalidLoginException extends Exception {

	public InvalidLoginException() {
		super();
	}

	public InvalidLoginException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidLoginException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidLoginException(String message) {
		super(message);
	}

	public InvalidLoginException(Throwable cause) {
		super(cause);
	}

}
