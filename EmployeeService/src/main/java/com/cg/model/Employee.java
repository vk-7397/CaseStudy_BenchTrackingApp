package com.cg.model;



import java.util.List;



import org.springframework.data.annotation.Id;

public class Employee {
	
	@Id
	private int empID;
	private String empName;
	private String grade;
	private String mentor;  
	private String iTransformStatus;
	private String track;
	private String projectBatchName;
	private String primarySkill;
	

	//default constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
    }
	
	

	/**
	 * @param empID
	 * @param empName
	 * @param grade
	 * @param mentor
	 * @param iTransformStatus
	 * @param track
	 * @param projectBatchName
	 * @param primarySkill
	 * @param assessment
	 */
	//parameterized constructor
	public Employee(int empID, String empName, String grade, String mentor, String iTransformStatus, String track,
			String projectBatchName, String primarySkill) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.grade = grade;
		this.mentor = mentor;
		this.iTransformStatus = iTransformStatus;
		this.track = track;
		this.projectBatchName = projectBatchName;
		this.primarySkill = primarySkill;
		
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
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	public String getiTransformStatus() {
		return iTransformStatus;
	}
	public void setiTransformStatus(String iTransformStatus) {
		this.iTransformStatus = iTransformStatus;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public String getProjectBatchName() {
		return projectBatchName;
	}
	public void setProjectBatchName(String projectBatchName) {
		this.projectBatchName = projectBatchName;
	}
	public String getPrimarySkill() {
		return primarySkill;
	}
	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}
	
	
	//to string
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", grade=" + grade + ", mentor=" + mentor
				+ ", iTransformStatus=" + iTransformStatus + ", track=" + track + ", projectBatchName="
				+ projectBatchName + ", primarySkill=" + primarySkill + "]";
	}
}