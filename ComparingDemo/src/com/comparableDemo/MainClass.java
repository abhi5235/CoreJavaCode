package com.comparableDemo;

public class MainClass {
	public static void main(String[] args) {

		Student s1 = new Student(11, "Abhishek", 70);
		Student s2 = new Student(12, "Gourav", 90);
		Student s3 = new Student(13, "Nikhil", 100);
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s1.compareTo(s3));
	}
}