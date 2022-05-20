package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.EmployeeDataAlreadyExistsException;
import com.cg.exception.EmployeeIdNotFound;
import com.cg.model.Employee;
import com.cg.service.EmployeeService;



@RestController
//@RequestMapping("/api/e1")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	  //create Employee
	 @PostMapping("/createEmployee")
		
	    public ResponseEntity <Employee> createEmployeeData(@RequestBody Employee emp)throws EmployeeDataAlreadyExistsException {
	        return ResponseEntity.ok().body(this.empService.createEmployeeData(emp));
	    }
	   //update Employee by employee id
	 @PutMapping("/updateEmployee/{empID}")
	    public ResponseEntity < Employee > updateEmployeeData(@PathVariable int empID, @RequestBody Employee emp) throws EmployeeIdNotFound {
	        emp.setEmpID(empID);
	        return ResponseEntity.ok().body(this.empService.updateEmployeeData(emp));
	    }
	  //display Employee
	 	@GetMapping("/dispEmployee")
	    public ResponseEntity < List < Employee >> getAllEmployeeData() {
		    return ResponseEntity.ok().body(empService.getAllEmployeeData());
	    }
	 	 //display Employee by employee id
	    @GetMapping("/getEmployee/{empID}")
	    public ResponseEntity < Employee > getEmployeeDataById(@PathVariable int empID) throws EmployeeIdNotFound {
	        return ResponseEntity.ok().body(empService.getEmployeeDataById(empID));
	    }
	    //delete Employee by employee id
	 	  @DeleteMapping("/deleteEmployee/{empID}") 
		    public HttpStatus deleteEmployeeDataById(@PathVariable int empID)throws EmployeeIdNotFound   {
		        this.empService.deleteEmployeeById(empID);
		        return HttpStatus.OK;
		    }

}
