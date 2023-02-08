package org.tnsif.thiskeyword;

 class Main
{
	int num;
	Main()
	{
		
	}
	Main(int num)
	{
		this.num = num;
	}
}
public class ThisKeywordExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj = new Main(5);
		System.out.println("num value: "+obj.num);
	}

}
