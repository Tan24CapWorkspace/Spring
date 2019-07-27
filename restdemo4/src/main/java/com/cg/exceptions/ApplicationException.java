package com.cg.exceptions;

/**
 * User defined exception
 * */
public class ApplicationException extends RuntimeException{
	public ApplicationException(String message) {
		super(message);
	}
}
