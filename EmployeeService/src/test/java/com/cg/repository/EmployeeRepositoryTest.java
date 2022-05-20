package com.cg.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.model.Employee;
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class EmployeeRepositoryTest {
	
	@Autowired
     private EmployeeRepository empRepo;
	
	@Test
	public void givenStudentShouldReturnStudentObject()
	{
		Employee s1=new Employee(101,"mayank","A1","Sameer","working","abc","JFS-Fresher-1001","spring"); //user Input
	empRepo.save(s1); //Data is saved into database;
	Employee s2=empRepo.findById(s1.getEmpID()).get(); //fetching the data from database
	assertNotNull(s2);//it is returning the student object	
	assertEquals(s1.getMentor(),s2.getMentor());
}
public void getAllmustReturnAllStudents() {
	Employee s3=new Employee(102,"ayush","A1","tarun","working","abc","JFS-Fresher-1001","spring"); //user input
	Employee s4=new Employee(103,"shubham","A1","Sameer","working","abc","JFS-Fresher-1001","spring");
	empRepo.save(s3);
	empRepo.save(s4);
	List<Employee>studList =(List<Employee>) empRepo.findAll();
	assertEquals("Sameer",studList.get(1).getMentor());
	// assertNotNull(studList.get(0));
	// assertEquals(3,studList.size());
	}
}
		
		
		
		
	
