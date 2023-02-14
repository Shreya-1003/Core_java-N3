package org.tnif.polymorphism;

import java.util.Scanner;

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("enetr the speed and color og hondacity: ");
		int speed = s.nextInt();
		s.nextLine();
		String color = s.nextLine();  
		HondaCity h = new HondaCity();
		HondaCity h1 = new HondaCity(speed,color);
		
		
	}

}
