package com.anily.petclinic.exception;

public class OwnerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 690559133248116070L;

	public OwnerNotFoundException(String message) {
		super(message);
	}

}
