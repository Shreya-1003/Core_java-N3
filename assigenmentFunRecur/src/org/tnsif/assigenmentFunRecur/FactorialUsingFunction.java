package org.tnsif.assigenmentFunRecur;
import java.util.*;
public class FactorialUsingFunction {
	//function definition
	static int factorial(int num)
	{
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact = i*fact;
		}
		return fact;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the value: ");
		
		int num = sc.nextInt();
		//function call
		System.out.println(" factorial is :"+factorial(num));
	}
}
