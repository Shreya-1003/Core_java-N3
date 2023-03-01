package org.tnsif.genericsdemo;

//Program to demonstrate on Generic class
//Generic class Definition
class GenericClass<T>
{
	T x;
	//to add the elements in the GenericClass
	void display(T x)
	{
		this.x=x;
	}
	//to return the elements
	T accept()
	{
		return x;
	}
}


//Driver class
public class GenericsClassDemo {

	public static void main(String[] args) {
		GenericClass<String>obj1=new GenericClass<>();
		obj1.display("TechnoServe India");
		//obj1.display(11);
		System.out.println(obj1.accept());
	}

}