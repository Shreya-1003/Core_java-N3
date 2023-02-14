package org.tnsif.exceptionhandlingdemo;
//program to demonstrate on nested try block
import java.util.Scanner;

public class NestedTryCatch {

	public static void main(String[] args) {
		int arr[] = new int[]{11,22,23};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x and y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		try
		{
			try {		
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("exceptionhandled" +e);
			}
			
			try {
				int res = x/y;
				System.out.println(res);
			}
			catch(ArithmeticException e)
			{
				System.out.println("exceptionhandled "+e);
			}
		}
		
		finally
		{
			System.out.println("finally block");
		}

	}

}
