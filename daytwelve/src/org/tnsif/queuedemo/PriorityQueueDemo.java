package org.tnsif.queuedemo;

import java.util.Queue;
import java.util.PriorityQueue;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer>obj = new PriorityQueue<>();
//		obj.add(67);
//		obj.add(5);
//		obj.add(11);
//		obj.add(15);
//		System.out.println("queue elements are"+obj);
		
		
		//add an offer method is use to insert an element
		obj.offer(13);
		obj.add(5);
		obj.add(11);
		obj.add(15);
		
		obj.remove();                   //poll and remove are use delete elements
		//obj.poll();
		System.out.println("queue elements are"+obj);
		System.out.println("head element is:"+obj.peek());
		

	}

}
