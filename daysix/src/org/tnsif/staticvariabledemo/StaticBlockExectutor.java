package org.tnsif.staticvariabledemo;

public class StaticBlockExectutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(StaticBlock.getName());
		StaticBlock s = new StaticBlock();
		s.setNum(145);
		System.out.println(s.getNum());
	}
	

}
