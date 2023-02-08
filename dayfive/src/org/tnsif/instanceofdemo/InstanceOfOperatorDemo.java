package org.tnsif.instanceofdemo;
import java.util.*;

public class InstanceOfOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name , address and age");
		String name = sc.nextLine();
		String address = sc.nextLine();
		int age = sc.nextInt();
		Child c = new Child();
		Child c1 = new Child(name,address,age);
		c1.setName(name);
		c1.setAddress(address);
		c1.setAge(age);
		System.out.println(c1);
		System.out.println(c instanceof Person);
		System.out.println(c1 instanceof Child);
	}

}
