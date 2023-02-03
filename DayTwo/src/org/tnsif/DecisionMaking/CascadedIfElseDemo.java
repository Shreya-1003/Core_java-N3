package org.tnsif.DecisionMaking;

import java.util.Scanner;

public class CascadedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a>b) && (a>c))
		{
			System.out.println("A ia greater");
		}
		else if((b>c)&& (b>a))
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater-");
		}
	}

}
