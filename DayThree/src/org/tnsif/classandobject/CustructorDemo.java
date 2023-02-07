package org.tnsif.classandobject;
import java.util.*;
public class CustructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id,name and city; ");
		int id;
		String custname,city;
		id = sc.nextInt();
		sc.nextLine();
		
		custname = sc.nextLine();
		city = sc.nextLine();
		
		//for cust
		Customer c = new Customer();
		c.setId(id);
		c.setCustname(custname);
		c.setCity(city);
		c.display();
		System.out.println(c.getId());
		System.out.println(c.getCustname());
		System.out.println(c.getCity());
		
		System.out.println("enter the id,name and city; ");
		int id1;
		String custname1,city1;
		id1 = sc.nextInt();
		sc.nextLine();
		
		custname1 = sc.nextLine();
		city1 = sc.nextLine();
		
		//for cust1
		Customer c1 = new Customer();
		c1.setId(id1);
		c1.setCustname(custname1);
		c1.setCity(city1);
		c1.display();
		
		
		

	}

}
