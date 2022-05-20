package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.Assessment;



public interface AssessmentRepository extends MongoRepository<Assessment, Integer> {
	
}
