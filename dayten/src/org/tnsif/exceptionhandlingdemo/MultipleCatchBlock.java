	package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

//program to demonstrate on multiple catch block
public class MultipleCatchBlock {

	public static void main(String[] args) {
		
			int arr[] = new int[]{11,22,23};
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the value of x and y");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			try {
				int res = x/y;
				System.out.println(arr[3]);
				System.out.println(res);
			}
//			catch(ArithmeticException e) {
//				System.out.println(e);
//				
//			}
//			catch(ArrayIndexOutOfBoundsException e)
//			{
//				System.out.println(e);
//			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
		

	}

}
