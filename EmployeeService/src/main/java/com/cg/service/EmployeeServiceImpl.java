package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.EmployeeDataAlreadyExistsException;
import com.cg.exception.EmployeeIdNotFound;
import com.cg.model.Employee;

import com.cg.repository.EmployeeRepository;


@Service


public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	 //create Employee
	@Override
	public Employee createEmployeeData(Employee emp) throws EmployeeDataAlreadyExistsException {
		// TODO Auto-generated method stub
		 //TODO Auto-generated method stub
			//System.out.println(cseRepo.findById(csy.getEmpID()).get());
			if(empRepo.existsById(emp.getEmpID()))
	{
			throw new EmployeeDataAlreadyExistsException();
		}
		return empRepo.save(emp);
	}
	
	
	 //display Employee
	@Override
	public List<Employee> getAllEmployeeData() {
		// TODO Auto-generated method stub
		return this.empRepo.findAll();
	}

	  //delete Employee by employee id
	@Override
	public void deleteEmployeeById(int empID) throws EmployeeIdNotFound {
		//empRepo.deleteById(empID);
		Optional<Employee> empDb = this.empRepo.findById(empID);

        if (empDb.isPresent()) {
        	
            this.empRepo.delete(empDb.get());
        } 
        else
        {
        	throw new EmployeeIdNotFound();
        }
	}
	   //update Employee by employee id
	@Override
	public Employee updateEmployeeData(Employee emp) throws EmployeeIdNotFound  {
		// TODO Auto-generated method stub
		Optional<Employee> empDb = this.empRepo.findById(emp.getEmpID());

        if (empDb.isPresent()) {
        	Employee empUpdate = empDb.get();
        	empUpdate.setEmpID(emp.getEmpID());
        	empUpdate.setEmpName(emp.getEmpName());
        	empUpdate.setGrade(emp.getGrade());
        	empUpdate.setMentor(emp.getMentor());
        	empUpdate.setiTransformStatus(emp.getiTransformStatus());
        	empUpdate.setProjectBatchName(emp.getProjectBatchName());
        	empUpdate.setPrimarySkill(emp.getPrimarySkill());
            empRepo.save(empUpdate);
            return empUpdate;
        }
        else
        {
        	throw new EmployeeIdNotFound();
        }
    }
	//display Employee by employee id
	@Override
	public Employee getEmployeeDataById(int empID)throws EmployeeIdNotFound {
		Optional<Employee> empDb = this.empRepo.findById(empID);

        if (empDb.isPresent()) {
        	
            return empDb.get();
        } 
        else
        {
        	throw new  EmployeeIdNotFound();
        }
	}




	}


