package com.cg.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.model.Certification;
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class CertificationRepositoryTest {
	
	@Autowired
     private CertificationRepository cerRepo;
	
	@Test
	public void givenCaseStudyShouldReturnCaseStudyObject()
	{
    Certification s1=new Certification(1,"Mayank","A","Sumit","AWS CP","20-08-22","20-11-22","complete"); //user Input
    cerRepo.save(s1); //Data is saved into database;
    Certification s2=cerRepo.findById(s1.getEmpID()).get(); //fetching the data from database
	assertNotNull(s2);//it is returning the student object	
	assertEquals(s1.getReportingmanager(),s2.getReportingmanager());
}
public void getAllmustReturnAllCaseStudy() {
	Certification s3=new Certification(2,"shubham","A","Sumit","AWS CP","20-08-22","20-11-22","complete"); //user input
	Certification s4=new Certification(3,"tarun","A","Sumit","AWS CP","20-08-22","20-11-22","complete");
	cerRepo.save(s3);
	cerRepo.save(s4);
	List<Certification>studList =(List<Certification>) cerRepo.findAll();
	assertEquals("aditya",studList.get(1).getReportingmanager());
	// assertNotNull(studList.get(0));
	// assertEquals(3,studList.size());
	}
}
		
		
		
		
	
