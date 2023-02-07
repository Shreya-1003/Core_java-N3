package org.tnsif.assigenmentFunRecur;
import java.util.*;
public class FibonacciFun {

	static int fibonacci(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		if(n == 1 || n == 2)
		{
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int  num = sc.nextInt();
		System.out.println(" nth term in fibonacci series is: "+fibonacci(num));		
	}

}
