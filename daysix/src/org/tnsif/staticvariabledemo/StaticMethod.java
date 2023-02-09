package org.tnsif.staticvariabledemo;
//program to demonstartate on static method
public class StaticMethod {
	
//	data memebers
	private static double salary=45000.67;
	//non static
	public static void display()
	{
		System.out.println("slaray is: "+salary);
	}
	
	//getter and setters
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
