package org.tnsif.annotations;

class Deprecateddemo{
	@Deprecated
	//deprecated method is use with
	public void display()
	{
		System.out.println("deprecated annotation demo");
	}
}

public class DeprecatedAnotation {

	public static void main(String[] args) {
		Deprecateddemo d = new Deprecateddemo();
		d.display();
		
	}

}
