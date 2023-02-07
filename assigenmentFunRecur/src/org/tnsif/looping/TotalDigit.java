package org.tnsif.looping;
import java.util.*;
public class TotalDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the value of N:");
			int no = sc.nextInt();
			int count =0;
			while(no != 0)
			{
				no = no/10;
				count++;
				
			}
			System.out.println("Total number of digits are:  "+count);
			
	}	

}
