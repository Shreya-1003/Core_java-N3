package org.tnsif.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//program to demonstrate on difference between hashset and linkedhashset
public class SetDemo {

	public static void main(String[] args) {
		//set1
		//HashSet will print the elements in unordered wise
		Set<Object>obj1=new HashSet<>();
		obj1.add(11);
		obj1.add("Naina");
		obj1.add(87.90f);
		//set doesn't allow duplicate elements
		obj1.add("Naina");
		System.out.println("Set1 elements are: "+obj1);
		//set2
		//LinkedHashSet will print the elements in ordered wise

		Set<Object>obj2=new LinkedHashSet<>();
		obj2.add(11);
		obj2.add("Naina");
		obj2.add(87.90f);
		System.out.println("Set2 elements are: "+obj2);
		
		System.out.println(obj1.equals(obj2));
		

	}

}
