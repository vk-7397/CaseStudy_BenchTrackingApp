package com.cg.service;

import java.util.List;

import com.cg.exception.EmployeeDataAlreadyExistsException;
import com.cg.exception.EmployeeIdNotFound;
import com.cg.model.Employee;

        public interface EmployeeService {
	    public Employee createEmployeeData(Employee emp) throws EmployeeDataAlreadyExistsException;
	    public Employee updateEmployeeData(Employee emp) throws EmployeeIdNotFound;
	    public Employee getEmployeeDataById(int empID)throws EmployeeIdNotFound ;
	    public List<Employee> getAllEmployeeData();
		public void  deleteEmployeeById(int empID)throws EmployeeIdNotFound;
}
