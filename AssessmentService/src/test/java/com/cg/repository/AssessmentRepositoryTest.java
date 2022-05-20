package com.cg.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.model.Assessment;
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class AssessmentRepositoryTest {
	
	@Autowired
     private AssessmentRepository asmRepo;
	
	@Test
	public void givenAssessmentShouldReturnCaseStudyObject()
	{
		Assessment s1=new Assessment(1004,78,87,87,"spring","MCQ","completed","Good","Good","17-03-22","30-05-22","abc","25"); //user Input
		asmRepo.save(s1); //Data is saved into database;
    Assessment s2=asmRepo.findById(s1.getEmpID()).get(); //fetching the data from database
	assertNotNull(s2);//it is returning the student object	
	assertEquals(s1.getAssementName(),s2.getAssementName());
}
public void getAllmustReturnAllAssessment() {
	Assessment s3=new Assessment(1005,78,87,87,"spring","MCQ","completed","Good","Good","17-03-22","30-05-22","abc","25"); //user input
	Assessment s4=new Assessment(1006,78,87,87,"spring","MCQ","completed","Good","Good","17-03-22","30-05-22","abc","25");
	asmRepo.save(s3);
	asmRepo.save(s4);
	List<Assessment>studList =(List<Assessment>) asmRepo.findAll();
	assertEquals("spring",studList.get(1).getAssementName());
	// assertNotNull(studList.get(0));
	// assertEquals(3,studList.size());
	}
}
		
		
		
		
	
