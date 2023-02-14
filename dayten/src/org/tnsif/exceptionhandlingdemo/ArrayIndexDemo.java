package org.tnsif.exceptionhandlingdemo;

public class ArrayIndexDemo {
	
	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("seconf line");
		
		try {
			int arr[] = new int[]{ 1,2,3};
			print(arr);
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("the array doesnt have fourth element"+e);
		}
		System.out.println("third line");
	
	}
	public static void print(int[] arr)
	{
		System.out.println(arr[3]);
	}

}
