package com.cg.model;

import org.springframework.data.annotation.Id;

public class Certification {
	@Id
 private int empID;
 private String empName;
 private String grade;	
 private String reportingmanager;
 private String certificationplanned;
 private String certificationplanneddate;
 private String certificationCompletedate;
 private String certificationstatus;
/**
 * 
 */
 //Default constructor
public Certification() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param empID
 * @param empName
 * @param grade
 * @param reportingmanager
 * @param certificationplanned
 * @param certificationplanneddate
 * @param certificationCompletedate
 * @param certificationstatus
 */
//Parameterized constructor
public Certification(int empID, String empName, String grade, String reportingmanager, String certificationplanned,
		String certificationplanneddate, String certificationCompletedate, String certificationstatus) {
	super();
	this.empID = empID;
	this.empName = empName;
	this.grade = grade;
	this.reportingmanager = reportingmanager;
	this.certificationplanned = certificationplanned;
	this.certificationplanneddate = certificationplanneddate;
	this.certificationCompletedate = certificationCompletedate;
	this.certificationstatus = certificationstatus;
}
//getter and setter
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getReportingmanager() {
	return reportingmanager;
}
public void setReportingmanager(String reportingmanager) {
	this.reportingmanager = reportingmanager;
}
public String getCertificationplanned() {
	return certificationplanned;
}
public void setCertificationplanned(String certificationplanned) {
	this.certificationplanned = certificationplanned;
}
public String getCertificationplanneddate() {
	return certificationplanneddate;
}
public void setCertificationplanneddate(String certificationplanneddate) {
	this.certificationplanneddate = certificationplanneddate;
}
public String getCertificationCompletedate() {
	return certificationCompletedate;
}
public void setCertificationCompletedate(String certificationCompletedate) {
	this.certificationCompletedate = certificationCompletedate;
}
public String getCertificationstatus() {
	return certificationstatus;
}
public void setCertificationstatus(String certificationstatus) {
	this.certificationstatus = certificationstatus;
}
//to string method
@Override
public String toString() {
	return "Certification [empID=" + empID + ", empName=" + empName + ", grade=" + grade + ", reportingmanager="
			+ reportingmanager + ", certificationplanned=" + certificationplanned + ", certificationplanneddate="
			+ certificationplanneddate + ", certificationCompletedate=" + certificationCompletedate
			+ ", certificationstatus=" + certificationstatus + "]";
}

 
 
 
 
 
 
 
 
}
