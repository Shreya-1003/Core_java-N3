package org.tnsif.looping;
import java.util.Scanner;
//to demonstrate the eg of for loop  
public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+" "); //print 1 to n numbers
		}
		
		System.out.println();
		for(int i = n;i>=1;i--)
		{
			System.out.println(i+" ");       //print n to 1
		}
	}

}
