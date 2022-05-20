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

import com.cg.exception.AssessmentDataAlreadyExistsException;
import com.cg.exception.EmployeeIdNotFound;
import com.cg.model.Assessment;
import com.cg.service.AssessmentService;






@RestController
//@RequestMapping("/api/a1")

public class AssessmentController {

 
	@Autowired
	private AssessmentService asmService;
	  //display Assessment
	  	@GetMapping("/dispAssessment")
	    public ResponseEntity < List <  Assessment >> getAllAssessmentData() {
		    return ResponseEntity.ok().body(asmService.getAllAssessmentData());
	    }
	  //display Assessment by employee id
	    @GetMapping("/getAssessment/{empID}")
	    public ResponseEntity < Assessment > getAssessmentDataById(@PathVariable int empID) throws EmployeeIdNotFound {
	        return ResponseEntity.ok().body(asmService.getAssessmentDataById(empID));
	    }
	    //create Assessment
	    @PostMapping("/createAssessment")
	
	    public ResponseEntity < Assessment > createPopulationData(@RequestBody Assessment asm) throws AssessmentDataAlreadyExistsException {
	        return ResponseEntity.ok().body(this.asmService.createAssessmentData(asm));
	    }
	    //update Assessment by employee id
	    @PutMapping("/updateAssessment/{id}")
	    public ResponseEntity < Assessment > updatePopulationData(@PathVariable int id, @RequestBody Assessment asm) throws EmployeeIdNotFound {
	        asm.setEmpID(id);
	        return ResponseEntity.ok().body(this.asmService.updateAssessmentData(asm));
	    }
	    //delete Assessment by employee id
	    @DeleteMapping("/deleteAssessment/{id}")
	    public HttpStatus deletePopulationDataById(@PathVariable int id) throws EmployeeIdNotFound {
	        this.asmService.deleteAssessmentDataById(id);
	        return HttpStatus.OK;
	    }
	
}