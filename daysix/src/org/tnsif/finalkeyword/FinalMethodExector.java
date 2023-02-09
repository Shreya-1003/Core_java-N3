package org.tnsif.finalkeyword;

public class FinalMethodExector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.age = 12;
		c.display();
		c.setName("shreya");
		c.display(c.getName());
		

	}

}
