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

import com.cg.exception.CertificationDataAlreadyExistsException;
import com.cg.exception.EmployeeIdNotFound;
import com.cg.model.Certification;
import com.cg.service.CertificationService;




@RestController
//@RequestMapping("/api/c1")

public class CertificationController {

 
	@Autowired
	private CertificationService cerService;
	   //display certification
	  	@GetMapping("/dispCertification")
	    public ResponseEntity < List < Certification >> getAllCertificationData() {
		    return ResponseEntity.ok().body(cerService.getAllCertificationData());
	    }
	  //display certification by employee id
	    @GetMapping("/getCertification/{empID}")
	    public ResponseEntity < Certification > getCertificationDataById(@PathVariable int empID) throws EmployeeIdNotFound {
	        return ResponseEntity.ok().body(cerService.getCertificationDataById(empID));
	    }
	    //create certification 
	    @PostMapping("/createCertification")
	
	    public ResponseEntity < Certification > createPopulationData(@RequestBody Certification pop) throws CertificationDataAlreadyExistsException {
	        return ResponseEntity.ok().body(this.cerService.createCertificationData(pop));
	    }
	    //update certification by employee id
	    @PutMapping("/updateCertification/{empID}")
	    public ResponseEntity < Certification > updatePopulationData(@PathVariable int empID, @RequestBody Certification pop) throws EmployeeIdNotFound {
	        pop.setEmpID(empID);
	        return ResponseEntity.ok().body(this.cerService.updateCertificationData(pop));
	    }
	    //delete certification by employee id
	    @DeleteMapping("/deleteCertification/{empID}")
	    public HttpStatus deleteCertificationDataById(@PathVariable int empID) throws EmployeeIdNotFound {
	        this.cerService.deleteCertificationDataById(empID);
	        return HttpStatus.OK;
	    }
	
}
