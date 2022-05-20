package com.cg.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.CertificationDataAlreadyExistsException;
import com.cg.exception.EmployeeIdNotFound;
import com.cg.model.Certification;
import com.cg.repository.CertificationRepository;



@Service

public class CertificationServiceImpl implements CertificationService {
   
	@Autowired
	private CertificationRepository cerRepo;
	
	@Override
	public Certification createCertificationData(Certification cer) throws CertificationDataAlreadyExistsException {
		// TODO Auto-generated method stub
		if(cerRepo.existsById(cer.getEmpID()))
		{
			throw new CertificationDataAlreadyExistsException();
		}
		return cerRepo.save(cer);
	}

	@Override
	public Certification updateCertificationData(Certification cer) throws EmployeeIdNotFound  {
		// TODO Auto-generated method stub
		Optional<Certification> cerDb = this.cerRepo.findById(cer.getEmpID());

        if (cerDb.isPresent()) {
        	Certification cerUpdate = cerDb.get();
            cerUpdate.setEmpID(cer.getEmpID());
            cerUpdate.setEmpName(cer.getEmpName());
            cerUpdate.setGrade(cer.getGrade());
            cerUpdate.setReportingmanager(cer.getReportingmanager());
            cerUpdate.setCertificationplanned(cer.getCertificationplanned());
            cerUpdate.setCertificationCompletedate(cer.getCertificationCompletedate());
            cerUpdate.setCertificationstatus(cer.getCertificationstatus());
         
            
            
            
            
            cerRepo.save(cerUpdate);
            return cerUpdate;
        }
        else
        {
        	throw new EmployeeIdNotFound();
        }
    }
	

	@Override
	public List<Certification> getAllCertificationData() {
		// TODO Auto-generated method stub
		return this.cerRepo.findAll();
	}

	@Override
	public Certification getCertificationDataById(int empID)throws EmployeeIdNotFound {
		Optional<Certification> cerDb = this.cerRepo.findById(empID);

        if (cerDb.isPresent()) {
        	
            return cerDb.get();
        } 
        else
        {
        	throw new EmployeeIdNotFound();
        }
	}

	@Override
	public void deleteCertificationDataById(int empID)throws EmployeeIdNotFound {
		// TODO Auto-generated method stub
		Optional<Certification> cerDb = this.cerRepo.findById(empID);

        if (cerDb.isPresent()) {
        	
            this.cerRepo.delete(cerDb.get());
        } 
        else
        {
        	throw new EmployeeIdNotFound();
        }
	}

}
