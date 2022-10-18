package abc;

public class Demo {

	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Abhishek", 20000);
		Employee e2 = new Employee(11, "Deepak", 25000);
		Employee e3 = new Employee(12, "Aryan", 26000);
		Employee e4 = new Employee(13, "Akarsh", 27000);
		Employee e5 = new Employee(14, "Anubhav", 28000);
		
		e1.taxDeduction();
		e2.taxDeduction();
		e3.taxDeduction();
		e4.taxDeduction();
		e5.taxDeduction();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
	}

}
