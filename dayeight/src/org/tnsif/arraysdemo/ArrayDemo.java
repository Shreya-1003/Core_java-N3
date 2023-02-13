package org.tnsif.arraysdemo;

import java.util.*;
public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of elements" + "in the array");
		int n = sc.nextInt();
		//array declaration
		System.out.println("enter number of elements");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("array elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("elements after sorted are: ");
		Arrays.sort(arr);
		
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(arr[i]+" ");
//		}
		
		
		//by using enhanced for loop++++
		
		for(int itr: arr)
		{
			System.out.println(itr+" ");
		}
		
		
	}

}
