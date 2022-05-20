package com.cg.service;

import java.util.List;

import com.cg.exception.AssessmentDataAlreadyExistsException;
import com.cg.exception.EmployeeIdNotFound;
import com.cg.model.Assessment;



public interface AssessmentService {
	public Assessment createAssessmentData(Assessment asm)throws AssessmentDataAlreadyExistsException;
	public Assessment updateAssessmentData(Assessment asm)throws EmployeeIdNotFound ;
	public List<Assessment> getAllAssessmentData();
	public Assessment getAssessmentDataById(int empID)throws EmployeeIdNotFound ;
	public void deleteAssessmentDataById(int id) throws EmployeeIdNotFound ;
}
