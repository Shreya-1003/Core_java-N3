package org.tnsif.multilevelinheritance;

public class Iphone extends Android{
	private String slottype;
	public void slot ()
	{
		System.out.println("slottype is: "+slottype);
	}
	//getter and setters
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	public Iphone(int modelno,String version,String slottype) {
		super();
		this.slottype = slottype;
	}
	public Iphone() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Iphone [slottype=" + slottype + ", getSlottype()=" + getSlottype() + ", getVersion()=" + getVersion()
				+ ", getModelno()=" + getModelno() + "]";
	}
	
	
	
	
	
	
	
	
		
}
