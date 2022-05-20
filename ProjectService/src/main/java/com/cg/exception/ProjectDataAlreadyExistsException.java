package com.cg.exception;

public class ProjectDataAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//default
	public ProjectDataAlreadyExistsException() {
		super();
		// TODO Auto-generated constructor stub
	}
//parameterized
	public ProjectDataAlreadyExistsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
