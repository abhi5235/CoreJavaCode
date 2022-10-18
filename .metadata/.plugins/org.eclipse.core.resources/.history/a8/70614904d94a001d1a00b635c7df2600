package com.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DrivingLicenceDemo {
	private String name;
	private int age;
	private int policeverification;
	private int medicheck;
	
Log logger=LogFactory.getLog(DrivingLicenceDemo.class);

@Override
public String toString() {
	return "DrivingLicenceDemo [name=" + name + ", age=" + age + ", policeeverification=" + policeverification
			+ ", medicheck=" + medicheck + ", logger=" + logger + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getPoliceverification() {
	return policeverification;
}

public void setPoliceverification(int policeverification) {
	this.policeverification = policeverification;
}

public int getMedicheck() {
	return medicheck;
}

public void setMedicheck(int medicheck) {
	this.medicheck = medicheck;
}

public DrivingLicenceDemo(String name, int age, int policeverification, int medicheck) {
	super();
	this.name = name;
	this.age = age;
	this.policeverification = policeverification;
	this.medicheck = medicheck;
}

public void ageverification() {
	if(age>18) {
		System.out.println("You are eligible for DL");
	}
	else
	{
		System.out.println("you are not eligible for DL");
		logger.info("your age not 18");
		throw new RuntimeException("you are not eligible");
	}
}
	public void policeverifi() {
		if(policeverification==0) {
			System.out.println("Police Verification is done");
		}
		else {
			System.out.println("You are not verified");
			logger.info("Your Police verification not verified");
			throw new RuntimeException("You are not eligible");
		}
	}
	public void medicheck() {
		if(medicheck==0) {
			System.out.println("Medical check is done");
		}
		else {
			System.out.println("You are not fit for DL");
			logger.info("You are not fit");
			throw new RuntimeException("You are not eligible");
		}
	}
}

