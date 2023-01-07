package com.ipl.cricket.sb.exception;

public class MatchNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MatchNotFoundException(String message) {
		super(message);
	}
}
