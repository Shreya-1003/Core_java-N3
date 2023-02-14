package org.tnsif.multilevelinheritance;

//to demeonstrate on multilevel inheritance
//parent1 class
public class Nokia {
	private int modelno;
	public void display()
	{
		System.out.println("The model no is: "+modelno);
	}
	
	//default constructor
	public Nokia() {
		System.out.println("Nokia class");
	}
	public Nokia(int modelno) {
		super();
		this.modelno = modelno;
	}

	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	

}
