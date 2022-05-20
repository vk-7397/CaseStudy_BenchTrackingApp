package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.AssessmentDataAlreadyExistsException;
import com.cg.exception.EmployeeIdNotFound;
import com.cg.model.Assessment;
import com.cg.repository.AssessmentRepository;

@Service
public class AssessmentServiceimpl implements AssessmentService {

	
		@Autowired
		private AssessmentRepository asmRepo;
		  //create Assessment
		@Override
		public  Assessment createAssessmentData(Assessment asm) throws  AssessmentDataAlreadyExistsException {
			// TODO Auto-generated method stub
			if(asmRepo.existsById(asm.getEmpID()))
			{
				throw new AssessmentDataAlreadyExistsException();
			}
			return asmRepo.save(asm);
		}
		  //update Assessment by employee id
		@Override
		public  Assessment updateAssessmentData(Assessment pop) throws EmployeeIdNotFound  {
			// TODO Auto-generated method stub
			Optional<Assessment> popDb = this.asmRepo.findById(pop.getEmpID());

	        if (popDb.isPresent()) {
	        	Assessment popUpdate = popDb.get();
	            popUpdate.setEmpID(pop.getDoSelectScore1());
	            popUpdate.setDoSelectScore2(pop.getDoSelectScore2());
	            popUpdate.setDoSelectScore3(pop.getDoSelectScore3());
	            popUpdate.setAssementName(pop.getAssementName());
	            popUpdate.setAssessmentType(pop.getAssessmentType());
	            popUpdate.setAssessmentStatus(pop.getAssessmentStatus());
	            popUpdate.setMentorFeedback(pop.getMentorFeedback());
	            popUpdate.setCommunicationskills(pop.getCommunicationskills());
	            popUpdate.setTrainingStartdate(pop.getTrainingStartdate());
	            popUpdate.setTrainingEndDate(pop.getTrainingEndDate());
	            popUpdate.setAgeing(pop.getAgeing());
	            popUpdate.setAgerange(pop.getAgerange());
	            asmRepo.save(popUpdate);
	            return popUpdate;
	        }
	        else
	        {
	        	throw new EmployeeIdNotFound();
	        }
	    }
		
		  //display Assessment
		@Override
		public List<Assessment> getAllAssessmentData() {
			// TODO Auto-generated method stub
			return this.asmRepo.findAll();
		}
		  //display Assessment by employee id
		@Override
		public Assessment getAssessmentDataById(int empID)throws EmployeeIdNotFound {
			Optional<Assessment> popDb = this.asmRepo.findById(empID);

	        if (popDb.isPresent()) {
	        	
	            return popDb.get();
	        } 
	        else
	        {
	        	throw new  EmployeeIdNotFound();
	        }
		}
		//delete Assessment by employee id
		@Override
		public void deleteAssessmentDataById(int id)throws EmployeeIdNotFound {
			// TODO Auto-generated method stub
			Optional<Assessment> popDb = this.asmRepo.findById(id);

	        if (popDb.isPresent()) {
	        	
	            this.asmRepo.delete(popDb.get());
	        } 
	        else
	        {
	        	throw new EmployeeIdNotFound();
	        }
		}

	}

   

