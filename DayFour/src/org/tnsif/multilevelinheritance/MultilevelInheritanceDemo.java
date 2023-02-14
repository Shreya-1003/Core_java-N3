package org.tnsif.multilevelinheritance;

import java.util.Scanner;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the modelno,version and slottype:");
		int modelno = sc.nextInt();
		sc.nextLine();
		String version = sc.nextLine();
		String slottype = sc.nextLine();
		
		Iphone i = new Iphone();
		Iphone i1 = new Iphone(1250,"kitkat","singleslot");
		i1.setModelno(modelno);
		i1.setVersion(version);
		i1.setSlottype(slottype);
		System.out.println(i1);
		i1.slot();
		i1.accept();
		i1.display();
		System.out.println(i1);

	}

}
