package org.tnsif.multithreading;

public class SynchronizationExecutor {

	public static void main(String[] args) {
		SynchronizationDemo obj = new SynchronizationDemo();
		ThreadOne t1= new ThreadOne(obj);
		Threadtwo t2 = new Threadtwo(obj);
		t1.start();
		t2.start();
		

	}

}
