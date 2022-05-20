package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
	
}