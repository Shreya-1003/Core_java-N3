package org.tnsif.hirerchicalinheritance;

import java.util.Scanner;

public class HirerchicalInheritance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the type and version");
		String type=s.nextLine();
		int version=s.nextInt();
		int version1=s.nextInt();
		SnowCone s1=new SnowCone(type,version); 
		s1.setType(type);
		s1.setVersion(version);
		
		Tiramisu t=new Tiramisu(type,version1);
		t.setType(type);
		t.setVersion(version1);
		
		System.out.println(s1);
		System.out.println(t);

	}

}
