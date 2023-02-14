package org.tnsif.abstractiondemo;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		
		ButterChicken b = new ButterChicken();
		//we  can't instantiate the abstract method of abstract class
//		menu m = new menu();
		
		b.foodtype();
		b.menutype();
		b.receipe();
	}

}
