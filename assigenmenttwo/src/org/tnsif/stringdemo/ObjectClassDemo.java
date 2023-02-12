package org.tnsif.stringdemo;

//program to demonstrate on object class
class Sample
{
	
}


//class Demo
//{
//	public Demo()
//	{ 
//		System.out.println("in constructor");
//		
//	}
//	protected void finalize()
//	{
//		System.out.println("in finalize");
//	}
//}
public class ObjectClassDemo {

	public static void main(String[] args) {
		
		Sample  s = new Sample();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
	}

}
