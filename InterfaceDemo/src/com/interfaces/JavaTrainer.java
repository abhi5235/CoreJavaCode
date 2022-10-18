package com.interfaces;

public class JavaTrainer extends Trainer implements Bonus,TaxCalcuation{
	
	private int salary;
	
	

	public JavaTrainer(int salary) {
		this.salary = salary;
	}

	 @Override
		public void addBonus() {
			this.salary=this.salary+bonus;
			
		}

	@Override
	public String toString() {
		return "JavaTrainer [salary=" + salary + "]";
	}


   

}
