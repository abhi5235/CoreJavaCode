package com.PracticeDemo;

import java.util.ArrayList;
import java.util.List;

import com.Practice.Employee;

public class MainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Abhishek", 25000);
		Employee e2 = new Employee(20, "Rohit", 18000);
		Employee e3 = new Employee(30, "Abhi", 19500);
		Employee e4 = new Employee(40, "Aarav", 20000);
		Employee e5 = new Employee(50, "Deepak", 19000);
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		for(Employee e:list) {
			if(e.getSalary()<20000)
				e.setSalary(e.getSalary()+5000);
		}
		System.out.println(list);
	}

}
