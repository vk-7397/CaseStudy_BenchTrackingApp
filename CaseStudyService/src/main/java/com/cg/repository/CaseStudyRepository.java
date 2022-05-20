package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.cg.model.CaseStudy;



public interface CaseStudyRepository extends MongoRepository<CaseStudy, Integer> {
	
}
