package com.cg.service;

import java.util.List;


import com.cg.exception.CaseStudyDataAlreadyExistsException;
import com.cg.exception.EmployeeIdNotFound;

import com.cg.model.CaseStudy;



public interface CaseStudyService {
	public CaseStudy createCaseStudyData(CaseStudy csy)throws CaseStudyDataAlreadyExistsException;
	public CaseStudy updateCaseStudyData(CaseStudy csy)throws EmployeeIdNotFound ;
	public List<CaseStudy> getAllCaseStudyData();
	public CaseStudy getCaseStudyDataById(int empID)throws EmployeeIdNotFound ;
	public void deleteCaseStudyDataById(int empID) throws EmployeeIdNotFound ;
}
