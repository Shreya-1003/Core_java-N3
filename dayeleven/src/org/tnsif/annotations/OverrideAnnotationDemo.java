package org.tnsif.annotations;

//demo on override annotation
class Parent{
	public void print()
	{
		System.out.println("parent class method");
	}
}

class child extends Parent
{
	@Override
	public void print()
	{
		super.print();
		System.out.println("child class method");
	}
}
public class OverrideAnnotationDemo {

	public static void main(String[] args) {
		
		Parent p = new child();
		p.print();
		

	}

}
