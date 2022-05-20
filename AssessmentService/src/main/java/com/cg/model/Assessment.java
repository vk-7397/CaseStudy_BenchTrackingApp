package com.cg.model;

import org.springframework.data.annotation.Id;

public class Assessment {
	
    @Id
    private int empID;
    private int doSelectScore1;
	private int doSelectScore2;
	private int doSelectScore3;
	private String assementName;
	private String assessmentType;
	private String assessmentStatus;
   	private String mentorFeedback;
	private String communicationskills;
	private String trainingStartdate;
	private String trainingEndDate;
	private String ageing;
	private String agerange;
	/**
	 * 
	 */
	//default constructor
	public Assessment() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param empID
	 * @param doSelectScore1
	 * @param doSelectScore2
	 * @param doSelectScore3
	 * @param assementName
	 * @param assessmentType
	 * @param assessmentStatus
	 * @param mentorFeedback
	 * @param communicationskills
	 * @param trainingStartdate
	 * @param trainingEndDate
	 * @param ageing
	 * @param agerange
	 */
	//parameterized constructor
	public Assessment(int empID, int doSelectScore1, int doSelectScore2, int doSelectScore3, String assementName,
			String assessmentType, String assessmentStatus, String mentorFeedback, String communicationskills,
			String trainingStartdate, String trainingEndDate, String ageing, String agerange) {
		super();
		this.empID = empID;
		this.doSelectScore1 = doSelectScore1;
		this.doSelectScore2 = doSelectScore2;
		this.doSelectScore3 = doSelectScore3;
		this.assementName = assementName;
		this.assessmentType = assessmentType;
		this.assessmentStatus = assessmentStatus;
		this.mentorFeedback = mentorFeedback;
		this.communicationskills = communicationskills;
		this.trainingStartdate = trainingStartdate;
		this.trainingEndDate = trainingEndDate;
		this.ageing = ageing;
		this.agerange = agerange;
	}
	//getter and setter
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public int getDoSelectScore1() {
		return doSelectScore1;
	}
	public void setDoSelectScore1(int doSelectScore1) {
		this.doSelectScore1 = doSelectScore1;
	}
	public int getDoSelectScore2() {
		return doSelectScore2;
	}
	public void setDoSelectScore2(int doSelectScore2) {
		this.doSelectScore2 = doSelectScore2;
	}
	public int getDoSelectScore3() {
		return doSelectScore3;
	}
	public void setDoSelectScore3(int doSelectScore3) {
		this.doSelectScore3 = doSelectScore3;
	}
	public String getAssementName() {
		return assementName;
	}
	public void setAssementName(String assementName) {
		this.assementName = assementName;
	}
	public String getAssessmentType() {
		return assessmentType;
	}
	public void setAssessmentType(String assessmentType) {
		this.assessmentType = assessmentType;
	}
	public String getAssessmentStatus() {
		return assessmentStatus;
	}
	public void setAssessmentStatus(String assessmentStatus) {
		this.assessmentStatus = assessmentStatus;
	}
	public String getMentorFeedback() {
		return mentorFeedback;
	}
	public void setMentorFeedback(String mentorFeedback) {
		this.mentorFeedback = mentorFeedback;
	}
	public String getCommunicationskills() {
		return communicationskills;
	}
	public void setCommunicationskills(String communicationskills) {
		this.communicationskills = communicationskills;
	}
	public String getTrainingStartdate() {
		return trainingStartdate;
	}
	public void setTrainingStartdate(String trainingStartdate) {
		this.trainingStartdate = trainingStartdate;
	}
	public String getTrainingEndDate() {
		return trainingEndDate;
	}
	public void setTrainingEndDate(String trainingEndDate) {
		this.trainingEndDate = trainingEndDate;
	}
	public String getAgeing() {
		return ageing;
	}
	public void setAgeing(String ageing) {
		this.ageing = ageing;
	}
	public String getAgerange() {
		return agerange;
	}
	public void setAgerange(String agerange) {
		this.agerange = agerange;
	}
	//to string
	@Override
	public String toString() {
		return "Assessment [empID=" + empID + ", doSelectScore1=" + doSelectScore1 + ", doSelectScore2="
				+ doSelectScore2 + ", doSelectScore3=" + doSelectScore3 + ", assementName=" + assementName
				+ ", assessmentType=" + assessmentType + ", assessmentStatus=" + assessmentStatus + ", mentorFeedback="
				+ mentorFeedback + ", communicationskills=" + communicationskills + ", trainingStartdate="
				+ trainingStartdate + ", trainingEndDate=" + trainingEndDate + ", ageing=" + ageing + ", agerange="
				+ agerange + "]";
	}
	
	
	
}	
	
	
	
	
	
	
	