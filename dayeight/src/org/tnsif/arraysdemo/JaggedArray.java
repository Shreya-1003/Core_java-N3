package org.tnsif.arraysdemo;

import java.util.*;
public class JaggedArray {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[2][];
		//first array has 3 column
		arr[0] = new int[3];
		//second atrray has 2 column
		arr[1] = new int[2];
		System.out.println("enter the elements: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
