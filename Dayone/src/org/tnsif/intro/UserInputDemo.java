package org.tnsif.intro;
import java.util.Scanner;
public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	@SuppressWarning("resource");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		float y = sc.nextFloat();
		char z = sc.next().charAt(0);
		String name = sc.next();
		sc.nextLine(); 
		String str = sc.nextLine();
		double d = sc.nextDouble();
		
		System.out.println("The value is x :"+x);
		System.out.println("The value is y : "+y);
		System.out.println("The value is z :"+z);
		System.out.println("The value is name :"+name);
		
		System.out.println("The value is str :"+str);
		System.out.println("The value is d :"+d);
		sc.close();
	}

}
