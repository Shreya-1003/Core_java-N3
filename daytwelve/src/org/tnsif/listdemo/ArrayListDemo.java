package org.tnsif.listdemo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//program to demonstrate on arraylist
public class ArrayListDemo {

	public static void main(String[] args) {
		
		/*Collection is an interface , we can't 
		 * create an object for a collection 
		 */
		//Collection obj=new Collection<>();
		//List1
		Collection<Object> obj=new ArrayList<>();
		obj.add(101);
		obj.add(30.8f);
		obj.add('z');
		System.out.println("First List is: "+obj);
		//List2
		List<Object> obj1=new ArrayList<>();
		/*obj1.add(101);
		obj1.add(30.8f);
		obj1.add('z');*/
		obj1.addAll(obj);
		obj1.add(30.8);
		System.out.println("Second List is: "+obj1);
		System.out.println("Size of List1 "+obj.size());
		System.out.println("Is List2 empty? "+obj1.isEmpty());
		obj.remove(1);
		System.out.println("First List is: "+obj);
		System.out.println(obj1.contains(101));
		System.out.println("Element at index 1: "+obj1.get(1));
		System.out.println("Index of 'z' :"+obj1.indexOf('z'));
		System.out.println("Last Index of 30.8f is :"+obj1.indexOf(30.8));
		obj.clear();
		System.out.println(obj);
		
		List<Integer>obj2=new ArrayList<>();
		obj2.add(67);
		obj2.add(16);
		obj2.add(45);
		System.out.println("List3 is: "+obj2);
		//to sort it ascending wise
		Collections.sort(obj2);
		System.out.println("Ascending order: " +obj2);
		Collections.reverse(obj2);
		System.out.println("Descending order: " +obj2);
	}

}
