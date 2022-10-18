package com.comparableDemo;

import java.util.Comparator;

public class MainClass2 {
public static void main(String[] args) {
	Employee e1=new Employee(11, "Abhishek", 20000);
	Employee e2=new Employee(12, "Lucky", 30000);
//	 NameComparator nm=new NameComparator();
//	 System.out.println(nm.compare(e1, e2));
	 Comparator<Employee> comp=(x,y)->(x.getName().compareTo(y.getName()));
	 System.out.println(comp.compare(e1, e2));
	
}
}
