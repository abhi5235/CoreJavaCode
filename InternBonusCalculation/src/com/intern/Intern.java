package com.intern;

public  abstract class Intern implements Bonus {
	
	private int internId;
	private String internName;
	private int internSalary;
	
	public int getInternId() {
		return internId;
	}
	public void setInternId(int internId) {
		this.internId = internId;
	}
	public String getInternName() {
		return internName;
	}
	public void setInternName(String internName) {
		this.internName = internName;
	}
	public int getInternSalary() {
		return internSalary;
	}
	public void setInternSalary(int internSalary) {
		this.internSalary = internSalary;
	}
	
}
