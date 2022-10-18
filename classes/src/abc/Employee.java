package abc;

public class Employee 
{
  int id;
  String name;
  double salary;
  
  Employee(int ide,String nam,double sal)
  {
	  id=ide;
	  name=nam;
	  salary=sal;
  }
  public void taxDeduction() {
	  this.salary= (this.salary-(0.01*this.salary));}
//  public static void main(String[] args) 
//  {
//	Employee e1= new Employee(10,"Abhishek",20000);
//	Employee e2=new Employee(11,"Deepak",25000);
//	Employee e3=new Employee(12,"Aryan",26000);
//	Employee e4=new Employee(13,"Akarsh",27000);
//	Employee e5=new Employee(14,"Anubhav",28000);
//	System.out.println(e1);
//	System.out.println(e2);
//	System.out.println(e3);
//	System.out.println(e4);
//	System.out.println(e5);

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
	

}
