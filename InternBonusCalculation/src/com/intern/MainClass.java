package com.intern;

public class MainClass {
	public static void main(String[] args) {
       JavaIntern i=new JavaIntern();
       i.setInternId(10);
       i.setInternName("Deepak");
       i.setInternSalary(25000);
       i.addbonus();
       System.out.println(i.getInternId());
       System.out.println(i.getInternName());
       System.out.println(i.getInternSalary());
	}
}
