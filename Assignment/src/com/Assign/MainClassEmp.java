package com.Assign;

import java.util.HashMap;
import java.util.Map;

public class MainClassEmp {

	public static void main(String[] args) {
		Employee e = new Employee(11, "Abhishek", 20000);
		Employee e1 = new Employee(12, "Rohit", 25000);
		Employee e2 = new Employee(13, "Sarthak", 30000);
		Employee e3 = new Employee(14, "Aryan", 35000);
		Employee e4 = new Employee(15, "Ayush", 40000);
		Map<Employee, String> hmap = new HashMap<>();
		hmap.put(e, "Telus");
		hmap.put(e1, "TCS");
		hmap.put(e2, "TechMahindra");
		hmap.put(e3, "Nagarro");
		hmap.put(e4, "ALT Digital");
		System.out.println(hmap);
		
	}

}
