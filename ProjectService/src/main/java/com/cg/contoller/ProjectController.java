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

import com.cg.exception.EmployeeIdNotFound;
import com.cg.exception.ProjectDataAlreadyExistsException;
import com.cg.model.Project;
import com.cg.service.ProjectService;






@RestController
//@RequestMapping("/api/c1")

public class ProjectController {

 
	@Autowired
	private ProjectService proService;
	  //display Project
	  	@GetMapping("/dispProject")
	    public ResponseEntity < List <  Project >> getAllProjectData() {
		    return ResponseEntity.ok().body(proService.getAllProjectData());
	    }
	  	 //display Project by employee id
	    @GetMapping("/getProject/{empID}")
	    public ResponseEntity < Project > getCaseStudyDataById(@PathVariable int empID) throws EmployeeIdNotFound {
	        return ResponseEntity.ok().body(proService.getProjectDataById(empID));
	    }
	    //create Project 
	    @PostMapping("/createProject")
	
	    public ResponseEntity < Project > createCaseStudyData(@RequestBody Project pro) throws ProjectDataAlreadyExistsException {
	        return ResponseEntity.ok().body(this.proService.createProjectData(pro));
	    }
	    //update Project by employee id
	    @PutMapping("/updateProject/{empID}")
	    public ResponseEntity < Project > updateProjectData(@PathVariable int empID, @RequestBody Project pro) throws EmployeeIdNotFound {
	        pro.setEmpID(empID);
	        return ResponseEntity.ok().body(this.proService.updateProjectData(pro));
	    }
	  //delete Project by employee id
	    @DeleteMapping("/deleteProject/{empID}")
	    public HttpStatus deleteProjectDataById(@PathVariable int empID) throws EmployeeIdNotFound {
	        this.proService.deleteProjectDataById(empID);
	        return HttpStatus.OK;
	    }
	
}