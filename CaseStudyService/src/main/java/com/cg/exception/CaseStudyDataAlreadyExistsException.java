package com.cg.exception;

public class CaseStudyDataAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//default
	public CaseStudyDataAlreadyExistsException() {
		super();
		// TODO Auto-generated constructor stub
	}
//parameterized
	public CaseStudyDataAlreadyExistsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
