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

import com.cg.exception.CaseStudyDataAlreadyExistsException;
import com.cg.model.CaseStudy;
import com.cg.repository.CaseStudyRepository;
@SpringBootTest
@ExtendWith(MockitoExtension.class)
class CaseStudyServiceTest {

		@Mock
		 private CaseStudyRepository cseRepo;
		
		@InjectMocks
		private CaseStudyServiceimpl csi;

		@Test
		public void TestcreateCaseStudyData() throws FileAlreadyExistsException, CaseStudyDataAlreadyExistsException {
			CaseStudy s1= new CaseStudy(11,"sam",65,"complete");//user input
		
		when(cseRepo.save(any())).thenReturn(s1);
		csi.createCaseStudyData(s1);//data is save in database
		verify(cseRepo,times(1)).save(any());
			
		}
		@Test
		public void testgetAllCaseStudyData()
		{
			CaseStudy s3=new CaseStudy(101,"sameer",75,"complete"); //user input
			CaseStudy s4=new CaseStudy(1001,"sameer",75,"complete");
			CaseStudy s5=new CaseStudy(10,"sam",65,"complete");
			cseRepo.save(s3);
			cseRepo.save(s4);
			cseRepo.save(s5);
			List<CaseStudy>dList = new ArrayList<>();//creating list object
			dList.add(s3);
			dList.add(s4);
			dList.add(s5);
			when(cseRepo.findAll()).thenReturn(dList);
			List<CaseStudy> dList1 = csi.getAllCaseStudyData();
			assertEquals(dList,dList1);
			verify(cseRepo,times(1)).save(s3);
			verify(cseRepo,times(1)).findAll();
			
		}
		
	}

