package com.cg.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.model.CaseStudy;
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class CaseStudyRepositoryTest {
	
	@Autowired
     private CaseStudyRepository cseRepo;
	
	@Test
	public void givenCaseStudyShouldReturnCaseStudyObject()
	{
    CaseStudy s1=new CaseStudy(1,"s",1,"complete"); //user Input
    cseRepo.save(s1); //Data is saved into database;
    CaseStudy s2=cseRepo.findById(s1.getEmpID()).get(); //fetching the data from database
	assertNotNull(s2);//it is returning the student object	
	assertEquals(s1.getArchitectassigned(),s2.getArchitectassigned());
}
	@Test	
public void getAllmustReturnAllCaseStudy() {
	CaseStudy s3=new CaseStudy(1001,"sameer1",75,"complete"); //user input
	CaseStudy s4=new CaseStudy(101,"sameer",75,"complete");
	cseRepo.save(s3);
	cseRepo.save(s4);
	List<CaseStudy>studList =(List<CaseStudy>) cseRepo.findAll();
	assertEquals(1001,studList.get(0).getEmpID());
	// assertNotNull(studList.get(0));
	// assertEquals(3,studList.size());
	}
}
		
		
		
		
	
