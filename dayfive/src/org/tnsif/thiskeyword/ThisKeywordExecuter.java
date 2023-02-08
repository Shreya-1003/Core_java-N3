package org.tnsif.thiskeyword;

class HR
{
	//void display(HR obj)
	void display()
	{
		System.out.println("hr");
	}
	void accept()
	{
		//display(this);
		display();
	}
}

public class ThisKeywordExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stu 
		HR obj = new HR();
		obj.accept();
		

	}

}
