package org.tnsif.staticvariabledemo;

public class StaticBlock {
	
	//non static also known as instance variable
	private int num=78;
	//static variable
	private static String name;
	
	//static block 
	//static block is use to initialize the static variable

	//getter setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static String getName() {
		return name;
	}
	static {
		
		name = "shreya";
	}

	public static void setName(String name) {
		StaticBlock.name = name;
	}
	

}
