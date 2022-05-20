package com.cg.model;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("caseStudy")
public class CaseStudy {
   @Id
	private int empID;
	private String architectassigned;
	private int score;
	private String casestudyevaulationstatus;
	/**
 * 
 */
//Default constructor
public CaseStudy() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param empID
 * @param architectassigned
 * @param score
 * @param casestudyevaulationstatus
 */
//Parameterized constructor
public CaseStudy(int empID, String architectassigned, int score, String casestudyevaulationstatus) {
	super();
	this.empID = empID;
	this.architectassigned = architectassigned;
	this.score = score;
	this.casestudyevaulationstatus = casestudyevaulationstatus;
}
//Getter and setter
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public String getArchitectassigned() {
	return architectassigned;
}
public void setArchitectassigned(String architectassigned) {
	this.architectassigned = architectassigned;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public String getCasestudyevaulationstatus() {
	return casestudyevaulationstatus;
}
public void setCasestudyevaulationstatus(String casestudyevaulationstatus) {
	this.casestudyevaulationstatus = casestudyevaulationstatus;
}
/*@Override
public String toString() {
	return "CaseStudy [empID=" + empID + ", architectassigned=" + architectassigned + ", score=" + score
			+ ", casestudyevaulationstatus=" + casestudyevaulationstatus + "]";
}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}