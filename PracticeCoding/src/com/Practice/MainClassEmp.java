package com.Practice;

import java.util.ArrayList;
import java.util.List;

public class MainClassEmp {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Abhishek", 25000);
		Employee e2 = new Employee(2, "Rohit", 18000);
		Employee e3 = new Employee(3, "Abhi", 19500);
		Employee e4 = new Employee(4, "Aarav", 20000);
		Employee e5 = new Employee(5, "Deepak", 19000);
		List<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);


		emp.stream().filter((e -> e.getSalary() < 20000)).forEach((e -> e.setSalary(e.getSalary() + 5000)));
		System.out.println(emp);
	}

}
