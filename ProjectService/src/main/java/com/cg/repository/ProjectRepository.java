package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.cg.model.Project;



public interface ProjectRepository extends MongoRepository<Project, Integer> {
	
}
