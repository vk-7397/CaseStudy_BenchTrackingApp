package com.cg.service;

import java.util.List;

import com.cg.exception.CertificationDataAlreadyExistsException;
import com.cg.exception.EmployeeIdNotFound;

import com.cg.model.Certification;


public interface CertificationService {


	public Certification createCertificationData(Certification cer)throws CertificationDataAlreadyExistsException;
	public Certification updateCertificationData(Certification cer)throws EmployeeIdNotFound ;
	public List<Certification> getAllCertificationData();
	public Certification getCertificationDataById(int empID)throws EmployeeIdNotFound ;
	public void deleteCertificationDataById(int empID) throws EmployeeIdNotFound ;
	
}
