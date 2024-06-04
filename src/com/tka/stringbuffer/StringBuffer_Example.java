package com.tka.stringbuffer;

public class StringBuffer_Example {
	

	public static void main(String[] args) {
	
		StringBuffer stringBuffer = new StringBuffer("Myrub");
		
		System.out.println(stringBuffer.capacity());
		System.out.println(stringBuffer.append("JBK"));
		System.out.println(stringBuffer.append(1105));
		StringBuffer newString = stringBuffer.delete(5, 8);
		System.out.println(newString);
		
	}

}
