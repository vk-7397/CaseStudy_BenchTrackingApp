package com.cg.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.Certification;


public interface CertificationRepository extends MongoRepository<Certification, Integer> {
	
}
