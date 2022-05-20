package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.ProjectDataAlreadyExistsException;
import com.cg.exception.EmployeeIdNotFound;
import com.cg.model.Project;
import com.cg.repository.ProjectRepository;



@Service
public class ProjectServiceimpl implements ProjectService {
	private ProjectRepository proRepo;
	
	@Autowired
	public ProjectServiceimpl(ProjectRepository proRepo) {
		super();
		this.proRepo = proRepo;
	}
		//@Autowired
		//private CaseStudyRepository cseRepo;
		
	 //create Project 
		@Override
		public  Project createProjectData(Project pro) throws ProjectDataAlreadyExistsException {
			 //TODO Auto-generated method stub
			//System.out.println(cseRepo.findById(csy.getEmpID()).get());
			if(proRepo.existsById(pro.getEmpID()))
	{
			throw new ProjectDataAlreadyExistsException();
		}
			
			
			Project savedDept = proRepo.save(pro);
			return savedDept;
		}
	    //update Project by employee id
		@Override
		public Project updateProjectData(Project pro) throws EmployeeIdNotFound  {
			// TODO Auto-generated method stub
			Optional<Project> proDb = this.proRepo.findById(pro.getEmpID());

	        if (proDb.isPresent()) {
	        	Project proUpdate = proDb.get();
	            proUpdate.setEmpID(pro.getEmpID());
	            proUpdate.setProjectname(pro.getProjectname());
	            proUpdate.setProjectmanagername(pro.getProjectmanagername());
	            proUpdate.setProjectclientname(pro.getProjectclientname());
	           
	            proRepo.save(proUpdate);
	            return proUpdate;
	        }
	        else
	        {
	        	throw new EmployeeIdNotFound();
	        }
	    }
		
		//display Project
		@Override
		public List<Project> getAllProjectData() {
			// TODO Auto-generated method stub
			return (List<Project>) proRepo.findAll();
		}
	  	 //display Project by employee id
		@Override
		public Project getProjectDataById(int empID)throws EmployeeIdNotFound {
			Optional<Project> proDb = this.proRepo.findById(empID);

	        if (proDb.isPresent()) {
	        	
	            return proDb.get();
	        } 
	        else
	        {
	        	throw new  EmployeeIdNotFound();
	        }
		}
		  //delete Project by employee id
		@Override
		public void deleteProjectDataById(int empID)throws EmployeeIdNotFound {
			// TODO Auto-generated method stub
			Optional<Project> csyDb = this.proRepo.findById(empID);

	        if (csyDb.isPresent()) {
	        	
	            this.proRepo.delete(csyDb.get());
	        } 
	        else
	        {
	        	throw new EmployeeIdNotFound();
	        }
		}


	


		
		}

	

   

