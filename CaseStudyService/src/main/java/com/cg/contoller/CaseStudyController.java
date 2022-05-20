	package com.cg.contoller;
	
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	
	import com.cg.exception.CaseStudyDataAlreadyExistsException;
	import com.cg.exception.EmployeeIdNotFound;
	import com.cg.model.CaseStudy;
	import com.cg.service.CaseStudyService;
	
	
	
	
	
	
	@RestController
	//@RequestMapping("/api/c1")
	
	public class CaseStudyController {
	
	 
		@Autowired
		private CaseStudyService cseService;
		//Get all case study
		  	@GetMapping("/dispCaseStudy")
		    public ResponseEntity < List <  CaseStudy >> getAllCaseStudyData() {
			    return ResponseEntity.ok().body(cseService.getAllCaseStudyData());
		    }
		   //Get all case study by employee id
		    @GetMapping("/getCaseStudy/{empID}")
		    public ResponseEntity < CaseStudy > getCaseStudyDataById(@PathVariable int empID) throws EmployeeIdNotFound {
		        return ResponseEntity.ok().body(cseService.getCaseStudyDataById(empID));
		    }
		    //create case study 
		    @PostMapping("/createCaseStudy")
		
		    public ResponseEntity < CaseStudy > createCaseStudyData(@RequestBody CaseStudy csy) throws CaseStudyDataAlreadyExistsException {
		        return ResponseEntity.ok().body(this.cseService.createCaseStudyData(csy));
		    }
		    //update case study by employee id
		    @PutMapping("/updateCaseStudy/{empID}")
		    public ResponseEntity < CaseStudy > updateCaseStudyData(@PathVariable int empID, @RequestBody CaseStudy csy) throws EmployeeIdNotFound {
		        csy.setEmpID(empID);
		        return ResponseEntity.ok().body(this.cseService.updateCaseStudyData(csy));
		    }
		    //delete case study by employee id 
		    @DeleteMapping("/deleteCaseStudy/{empID}")
		    public HttpStatus deleteCaseStudyDataById(@PathVariable int empID) throws EmployeeIdNotFound {
		        this.cseService.deleteCaseStudyDataById(empID);
		        return HttpStatus.OK;
		    }
		
	}