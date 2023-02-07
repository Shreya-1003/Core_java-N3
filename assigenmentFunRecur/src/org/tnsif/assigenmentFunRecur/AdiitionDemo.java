package org.tnsif.assigenmentFunRecur;
import java.util.Scanner;
import java.util.*;
public class AdiitionDemo {
	//function definition

//	static int addition(int x,int y) {
//		int sum = x+y;
//		return sum;
//		
//	}
	static void addition(int a,int b)
	{
		int sum = a+b;
		System.out.println("the sum is: "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the vslue of a & b :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		//function call
		addition(x,y);  
		//sc.close();
		//System.out.println(addition(a,b));
		

	}

}
