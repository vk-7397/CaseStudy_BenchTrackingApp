package com.cg.model;
import org.springframework.data.annotation.Id;
public class Project {
	@Id
	 private int empID; 
     private String projectname;
     private String projectmanagername;
     private String projectclientname;
	/**
	 * 
	 */
     //default constructor
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param empID
	 * @param projectname
	 * @param projectmanagername
	 * @param projectclientname
	 */
	 //Parameterized constructor
	public Project(int empID, String projectname, String projectmanagername, String projectclientname) {
		super();
		this.empID = empID;
		this.projectname = projectname;
		this.projectmanagername = projectmanagername;
		this.projectclientname = projectclientname;
	}

   //getter and setter
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getProjectmanagername() {
		return projectmanagername;
	}
	public void setProjectmanagername(String projectmanagername) {
		this.projectmanagername = projectmanagername;
	}
	public String getProjectclientname() {
		return projectclientname;
	}
	public void setProjectclientname(String projectclientname) {
		this.projectclientname = projectclientname;
	}
	//to string
	@Override
	public String toString() {
		return "Project [empID=" + empID + ", projectname=" + projectname + ", projectmanagername=" + projectmanagername
				+ ", projectclientname=" + projectclientname + "]";
	}
	
     
}
