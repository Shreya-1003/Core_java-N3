package org.tnsif.queuedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		Deque<String> obj = new ArrayDeque<>();
		obj.add("shreya");
		obj.add("sayali");
		obj.add("rasika");
		System.out.println("array dequeue elements are: "+obj);

	}

}
