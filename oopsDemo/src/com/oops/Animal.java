package com.oops;

public class Animal extends LivingBeing {
	String name;

	Animal() {
		System.out.println("Animal object is created");
		
		
	}

	public String getNameofAnimal() {
		return this.name;
	}

	public void setNameofAnimal(String name) {
		this.name = name;
	}

}
	


