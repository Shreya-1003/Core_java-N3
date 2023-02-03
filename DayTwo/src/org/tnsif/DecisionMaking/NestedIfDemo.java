package org.tnsif.DecisionMaking;
import java.util.*;
public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age and weight of a person");
		int age = sc.nextInt();
		int weight = sc.nextInt();
		if(age >= 12)
		{
			if(weight>=40)
			{
				if(weight<120)
				{
					System.out.println("eligible for bunjee jumping");
				}
				else
				{
					System.out.println("  extra rope will be added");
				}
			}
			else
			{
				System.out.println("not eligible");
			}
		}
		else
		{
			System.out.println("not eligible");
		}
	}
}
