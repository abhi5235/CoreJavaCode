package com.intern;

public class JavaIntern extends Intern implements Bonus 
{

	@Override
	public void addbonus() {
super.setInternSalary(Bonus+super.getInternSalary());	
//		super.setInternSalary(getInternSalary());
	}

	@Override
	public String toString() {
		return "JavaIntern [getInternId()=" + getInternId() + ", getInternName()=" + getInternName()
				+ ", getInternSalary()=" + getInternSalary() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
   
   
   


