package com.cg.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.cg.contoller.CaseStudyController;
import com.cg.model.CaseStudy;
import com.cg.service.CaseStudyService;

import com.fasterxml.jackson.databind.ObjectMapper;

@ExtendWith(MockitoExtension.class)
public class CaseStudyControllerTest {
	
	
	@Autowired
	private MockMvc mockMvc;
	
	@Mock
	private CaseStudyService ds;
	private CaseStudy dt;
	private List<CaseStudy> csyList;
	
	@InjectMocks
	private CaseStudyController dc;
	
	@BeforeEach
	public void setup()
	{
		dt=new CaseStudy(1,"shubham",1,"complete");
		mockMvc=MockMvcBuilders.standaloneSetup(dc).build();
	}
	
	@Test
	public void addStudentControllerTest() throws Exception 
	{
		when(ds.createCaseStudyData(any())).thenReturn(dt);
		mockMvc.perform(post("/createCaseStudy")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJSONString(dt)))
		//		.andExpect(status().isCreated());
		.andDo(MockMvcResultHandlers.print()); //print JSON object
		verify(ds,times(1)).createCaseStudyData(any());
	}
	@Test
	public void getAllStudentControllerTest() throws Exception
	{
		when(ds.getAllCaseStudyData()).thenReturn(csyList);
		mockMvc.perform(MockMvcRequestBuilders.get("/dispCaseStudy")
		.contentType(MediaType.APPLICATION_JSON)
		.content(asJSONString(dt)))
		.andDo(MockMvcResultHandlers.print()); //print JSON object
		verify(ds,times(1)).getAllCaseStudyData();
		
	}

	public static String asJSONString(final Object obj) {
		// TODO Auto-generated method stub
		try
		{
		return new ObjectMapper().writeValueAsString(obj);
		}catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	

}
