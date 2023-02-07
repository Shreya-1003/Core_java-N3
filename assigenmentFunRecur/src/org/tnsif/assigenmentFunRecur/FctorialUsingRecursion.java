package org.tnsif.assigenmentFunRecur;
import java.util.*;
public class FctorialUsingRecursion {

	static int factorial(int num)
	{
		if(num!=0)
		{
			return num*factorial(num-1);
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value: ");
		
		int num = sc.nextInt();
		//function call
		System.out.println(" factorial is :"+factorial(num));

	}

}
