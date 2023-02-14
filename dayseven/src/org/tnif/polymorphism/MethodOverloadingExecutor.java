package org.tnif.polymorphism;

import java.util.Scanner;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the resolution and slottype" + "of a cellphone");
		int resolution = sc.nextInt();
		sc.nextLine();
		String slottype = sc.nextLine();
		Smartphones s = new Smartphones(); 
		s.setResolution(resolution);
		s.setSlottype(slottype);
	
		s.display(resolution, slottype);
		
		
		multiplication m = new multiplication();
	    System.out.println(m.mul(15, 2));
		System.out.println(m.mul(12.5f, 3));

	}

}
