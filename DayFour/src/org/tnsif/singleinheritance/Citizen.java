package org.tnsif.singleinheritance;
//these program is to demonstrate on single level inheritance
public class Citizen {
	
	//private data members
	private String name;
	private String adharno;
	private String city;
	private long mbno;
	
	//these is  a getter an d setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMbno() {
		return mbno;
	}
	public void setMbno(long mbno) {
		this.mbno = mbno;
	}
	//default constructor
	public Citizen() {
		System.out.println("parent class");
	}
	//parametarized constructor
	public Citizen(String name, String adharno, String city, long mbno) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.city = city;
		this.mbno = mbno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharno=" + adharno + ", city=" + city + ", mbno=" + mbno + "]";
	}
}
