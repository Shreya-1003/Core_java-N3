package org.tnsif.assigenmentFunRecur;
import java.util.*;
public class SumDigitsRecu {
	static int sumdigit(int n)
	{
		if(n == 0)
			return 0;
		return (n % 10 + sumdigit(n/10));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the digits:");
		int num = sc.nextInt();
		System.out.println("sum of digits are: "+sumdigit(num));
	}

}
