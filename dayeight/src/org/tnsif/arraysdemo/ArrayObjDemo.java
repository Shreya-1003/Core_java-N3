package org.tnsif.arraysdemo;

import java.util.Scanner;

public class ArrayObjDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student arr[];  //
		System.out.println("enter the number of elements in the array");
		int n = sc.nextInt();
		arr = new Student[n];
		
		int i=0;
		while(i<n)
		{
			arr[i] = new Student(sc.nextInt(),sc.next(),sc.nextFloat());
			i++;
		}
		for(int j=0;j<n;j++)
		{
			System.out.println(arr[j].getRollno());
			System.out.println(arr[j].getName());
			System.out.println(arr[j].getPercentage());
		}
		
	}

}
