package org.tnsif.multithreading;

//driver executor
public class ThreadExecutor {

	public static void main(String[] args) {
		SimpleThreadProgram p = new SimpleThreadProgram();
		//change the tread name
		p.setName("java thread");
		//use to chnage the thread priority
		p.setPriority(8);
		
		//when thread clls to thread method it will come to run method
		p.start();
		p.run();
		
		
		
		//once we call strat method we cant call it double
		//p.start();
		System.out.println("current thread" +p);

	}

}
