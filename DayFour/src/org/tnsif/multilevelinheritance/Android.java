package org.tnsif.multilevelinheritance;

public class Android extends Nokia{

	private String version;
	public void accept()
	{
		System.out.println("the android name is: "+version);
	}
	//getters and setters
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Android() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Android(String version) {
		super();
		this.version = version;
		// TODO Auto-generated constructor stub
	}
	
	

}
