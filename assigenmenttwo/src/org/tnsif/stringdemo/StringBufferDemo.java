package org.tnsif.stringdemo;

//prpgram to demonstrate on stringbuffer
public class StringBufferDemo {

	public static void main(String[] args) {
		//length vs capacity
		StringBuffer sb = new StringBuffer("shreya");
		System.out.println(sb);
		System.out.println(sb.capacity());  //by default 16
		System.out.println(sb.length());
		
		String str;
		int a = 34;
		sb=new StringBuffer(40);
		str = sb.append(a).toString();
		System.out.println(str);
		System.out.println(sb); //34
		System.out.println(sb.reverse()); //43

	}

}
