package org.tnsif.singleinheritance;

public class Student extends Citizen{
	
	//private data members
	private int rollno;
	private String stdname;
	
	//getter and setter method
	public int getRollno() {
		return rollno;
	}
	
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStdname() {
		return stdname;
	}
	//default 
	public Student() {
		super();
		
	}
	//parameterized 
		public Student(String name, String adharno, String city,long mbno, int rollno, String stdname) {
			super(name,adharno,city,mbno);
			this.rollno = rollno;
			this.stdname = stdname;
	}
	//to string


		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", stdname=" + stdname + ", getRollno()=" + getRollno()
					+ ", getStdname()=" + getStdname() + ", getName()=" + getName() + ", getAdharno()=" + getAdharno()
					+ ", getCity()=" + getCity() + ", getMbno()=" + getMbno() + "]";
		}
	
	
	
	

}
