package org.tnsif.exceptionhandlingdemo;

//program to demonstrate on arthematic exception
import java.util.Scanner;

public class ArithematicException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x and y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//try block contins the exception code
		try {	
			int res = x/y;
			System.out.println(res);
		}
		//catch block will handel the exception thrown by try block
		catch(Exception e){
			System.out.println("exception handling using catch "+e);
		}
		finally {
			System.out.println("finally block");
		}
		
	}

}
