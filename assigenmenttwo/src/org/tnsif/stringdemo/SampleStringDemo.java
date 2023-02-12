package org.tnsif.stringdemo;

import java.util.Scanner;

//program to demonstrate an example on string creating
public class SampleStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//using string lateral
		System.out.println("enter the first string");
		String str1 = sc.nextLine();
		System.out.println(("first string is:"+str1));
		
		//using new keyword
		System.out.println("enter the second string");
		String str2 = new String(sc.nextLine());
		System.out.println(("second string is:"+str2));
		
		if(str1 == str2)   //if(str1.equals str2)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("different");
		}
		
		//character array string
		char c[] = {'h','e','l','l','o'};      
		String str3 = new String(c);
		System.out.println(str3);
		
	}

}
