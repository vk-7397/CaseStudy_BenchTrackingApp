package com.cg.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.model.Project;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ProjectRepositoryTest {
	
	@Autowired
     private ProjectRepository studRepo;
	
	@Test
	public void givenProjectShouldReturnProjectObject()
	{
    Project s1=new Project(1,"nokia","sumit","ryan"); //user Input
	studRepo.save(s1); //Data is saved into database;
	Project s2=studRepo.findById(s1.getEmpID()).get(); //fetching the data from database
	assertNotNull(s2);//it is returning the student object	
	assertEquals(s1.getProjectmanagername(),s2.getProjectmanagername());
}
/*public void getAllmustReturnAllProject() {
	Project s3=new Project(2,"sammsung","sumit","ryan"); //user input
	Project s4=new Project(3,"nokia","sumit","ryan");
	studRepo.save(s3);
	studRepo.save(s4);
	List<Project>studList =(List<Project>) studRepo.findAll();
	assertEquals("nokia",studList.get(0).getProjectname());
	// assertNotNull(studList.get(0));
	// assertEquals(3,studList.size());
	}*/
}
		
		
		
		
	
