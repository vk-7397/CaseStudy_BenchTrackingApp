package com.cg.exception;

public class EmployeeDataAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//default constructor
	public EmployeeDataAlreadyExistsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public EmployeeDataAlreadyExistsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
