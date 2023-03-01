package org.tnsif.genericsdemo;
import java.awt.List;
import java.util.ArrayList;
//program to demonstrate on Advantages of generics
public class GenericsAdvantagesExample {

	public static void main(String[] args) {
		
		//1.Type-safety
		//without generics
		ArrayList obj=new ArrayList<>();
		obj.add(15);
		obj.add("15");
		System.out.println("Without Generics "+obj);
		//with Genrics
		ArrayList<Integer> obj1=new ArrayList<>();
		obj1.add(15);
		//obj1.add("15");
		System.out.println("With Generics "+obj1);

		//2.Typecasting is allowed before generics
		ArrayList obj2=new ArrayList<>();
		obj2.add("MET");
		//typecasting
		String str=(String)obj2.get(0);
		System.out.println(str);
		
		//with generics,Typecasting is not allowed 
		ArrayList<String> obj3=new ArrayList<>();
		obj3.add("MET");
		String str1=obj3.get(0);
		System.out.println(obj3);
		
		
	}

}