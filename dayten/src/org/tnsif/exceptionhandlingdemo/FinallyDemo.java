package org.tnsif.exceptionhandlingdemo;

//program to demonstrate on when finally block is not executed
public class FinallyDemo {

	public static void main(String[] args) {
		int arr[] = new int[] {101,32,34};
		
		try {
			
			System.out.println("c2tc");
			
			//1.when it calls to system.exit(0)
			//System.exit(0);
			System.out.println(arr[3]);
		}
		catch(Exception e ){
			System.out.println("exception handle"+e);
		}
		finally {
//			2.when finally block contain exception
			int res = 12/0;
			System.out.println( +res);
			System.out.println("finally block");
		}

	}

}
