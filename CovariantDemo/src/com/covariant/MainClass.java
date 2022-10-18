package com.covariant;

public class MainClass {
	
	public static void main(String[] args) {

		Animal animal = new Lion();
		Animal roar = animal.roar();
		System.out.println(roar.getClass());
	}
}
