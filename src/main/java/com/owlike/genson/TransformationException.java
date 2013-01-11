package com.owlike.genson;

public final class TransformationException extends Exception {
	private static final long serialVersionUID = -1267673244135892897L;

	public TransformationException(String message, Throwable cause) {
		super(message, cause);
	}

	public TransformationException(String message) {
		super(message);
	}

	public TransformationException(Throwable cause) {
		super(cause);
	}
	
}