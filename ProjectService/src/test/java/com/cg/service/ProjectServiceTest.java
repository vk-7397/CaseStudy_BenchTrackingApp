package com.cg.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.exception.ProjectDataAlreadyExistsException;
import com.cg.model.Project;

import com.cg.repository.ProjectRepository;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ProjectServiceTest {

		@Mock
		private ProjectRepository dr;
		
		@InjectMocks
		private ProjectServiceimpl dsl;

		@Test
		public void TestAddAgency() throws FileAlreadyExistsException, ProjectDataAlreadyExistsException {
			Project s1= new Project(1,"nokia","sumit","ryan");//user input
		
		when(dr.save(any())).thenReturn(s1);
		dsl.createProjectData(s1);//data is save in database
		verify(dr,times(1)).save(any());
			
		}
		@Test
		public void testGetAllAgencys()
		{
			Project s3=new Project(1,"nokia","sumit","ryan"); //user input
			Project s4=new Project(1,"nokia","sumit","ryan");
			Project s5=new Project(1,"nokia","sumit","ryan");
			dr.save(s3);
			dr.save(s4);
			dr.save(s5);
			List<Project>dList = new ArrayList<>();//creating list object
			dList.add(s3);
			dList.add(s4);
			dList.add(s5);
			when(dr.findAll()).thenReturn(dList);
			List<Project> dList1 = dsl.getAllProjectData();
			assertEquals(dList,dList1);
			verify(dr,times(1)).save(s3);
			verify(dr,times(1)).findAll();
			
		}
		
	}

