package com.cg.service;

import java.util.List;

import com.cg.exception.EmployeeIdNotFound;
import com.cg.exception.ProjectDataAlreadyExistsException;
import com.cg.model.Project;



public interface ProjectService {

	public List<Project> getAllProjectData();
	public Project getProjectDataById(int empID)throws EmployeeIdNotFound ;
	public void deleteProjectDataById(int empID) throws EmployeeIdNotFound ;
	public Project createProjectData(Project pro) throws ProjectDataAlreadyExistsException;
	public Project updateProjectData(Project pro) throws EmployeeIdNotFound;
}
