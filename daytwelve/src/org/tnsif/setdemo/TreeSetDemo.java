package org.tnsif.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

//program to demonstrate on sortedset
public class TreeSetDemo {

	public static void main(String[] args) {
		//TreeSet is used to arrange the string in sorted order
		SortedSet<String>obj=new TreeSet<>();
		obj.add("Shiwani");
		obj.add("Shivani");
		obj.add("Shreya");
		System.out.println("Strings are: "+obj);
		

	}

}
