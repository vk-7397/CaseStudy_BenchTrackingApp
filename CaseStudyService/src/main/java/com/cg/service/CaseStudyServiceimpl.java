	package com.cg.service;
	
	import java.util.List;
	import java.util.Optional;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	
	import com.cg.exception.CaseStudyDataAlreadyExistsException;
	import com.cg.exception.EmployeeIdNotFound;
	
	import com.cg.model.CaseStudy;
	
	import com.cg.repository.CaseStudyRepository;
	
	@Service
	public class CaseStudyServiceimpl implements CaseStudyService {
		private CaseStudyRepository cseRepo;
		
		@Autowired
		public CaseStudyServiceimpl(CaseStudyRepository cseRepo) {
			super();
			this.cseRepo = cseRepo;
		}
			//@Autowired
		//private CaseStudyRepository cseRepo;
		
		  //create case study 
		@Override
		public  CaseStudy createCaseStudyData(CaseStudy csy) throws CaseStudyDataAlreadyExistsException {
			 //TODO Auto-generated method stub
			//System.out.println(cseRepo.findById(csy.getEmpID()).get());
			if(cseRepo.existsById(csy.getEmpID()))
	{
			throw new CaseStudyDataAlreadyExistsException();
		}
			
			
			CaseStudy savedDept = cseRepo.save(csy);
			return savedDept;
		}
		  //update case study by employee id
		@Override
		public CaseStudy updateCaseStudyData(CaseStudy csy) throws EmployeeIdNotFound  {
			// TODO Auto-generated method stub
			Optional<CaseStudy> csyDb = this.cseRepo.findById(csy.getEmpID());
	
	        if (csyDb.isPresent()) {
	        	CaseStudy csyUpdate = csyDb.get();
	            csyUpdate.setEmpID(csy.getEmpID());
	            csyUpdate.setArchitectassigned(csy.getArchitectassigned());
	            csyUpdate.setScore(csy.getScore());
	            csyUpdate.setCasestudyevaulationstatus(csy.getCasestudyevaulationstatus());
	           
	            cseRepo.save(csyUpdate);
	            return csyUpdate;
	        }
	        else
	        {
	        	throw new EmployeeIdNotFound();
	        }
	    }
		
		   //Get all case study
		@Override
		public List<CaseStudy> getAllCaseStudyData() {
			// TODO Auto-generated method stub
			return (List<CaseStudy>) cseRepo.findAll();
		}
		   //Get all case study by employee id
		@Override
		public CaseStudy getCaseStudyDataById(int empID)throws EmployeeIdNotFound {
			Optional<CaseStudy> csyDb = this.cseRepo.findById(empID);
	
	        if (csyDb.isPresent()) {
	        	
	            return csyDb.get();
	        } 
	        else
	        {
	        	throw new  EmployeeIdNotFound();
	        }
		}
	 //delete case study by employee id 
		@Override
		public void deleteCaseStudyDataById(int empID)throws EmployeeIdNotFound {
			// TODO Auto-generated method stub
				Optional<CaseStudy> csyDb = this.cseRepo.findById(empID);
	
		        if (csyDb.isPresent()) {
		        	
		            this.cseRepo.delete(csyDb.get());
		        } 
		        else
		        {
		        	throw new EmployeeIdNotFound();
		        }
			}
	
		}
	
	   
	
