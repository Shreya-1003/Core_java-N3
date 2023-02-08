package org.tnsif.DecisionMaking;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the song number");
		int songno = sc.nextInt();
		switch(songno)
		{
		case 1:
			System.out.println("Kesariya");
			break;
		case 2:
			System.out.println("ved");
			break;
		case 3:
			System.out.println("calm down");
			break;
		default:
			System.out.println("Invalid input");
		}
	}
	
}
