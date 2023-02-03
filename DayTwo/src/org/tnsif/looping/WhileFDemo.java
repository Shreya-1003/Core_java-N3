package org.tnsif.looping;
import java.util.*;
public class WhileFDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n = sc.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(i+" ");
			i++;
		}
		i=1;
		while(n>=i)
		{
			System.out.print(n+" ");
			n--;
		}
	}

}
