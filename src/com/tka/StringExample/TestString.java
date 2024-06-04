package com.tka.StringExample;

public class TestString {
	
	public static void main(String[] args) {
		StringOperations stringOperations = new StringOperations();
		String str = "The The Kiran Academy";
		String str1 = " Myrub ";
		String firstStr = "MyRub";
		String secondStr = "myRub";
		System.out.println("........length() Method..........");
		int length = stringOperations.getlength(str);
		System.out.println("Length of "+str+ " is "+length);
		
		System.out.println("\n........charAt() Mrthod..........");
		char ch = stringOperations.getSpecificChar(str, 7);
		System.out.println("Specific char of "+str+" and postion is 7 is : "+ch);
		
		System.out.println("\n.........subString() Mrthod...........");
		String subString = stringOperations.getSubString(str, 5, 9);
		System.out.println("SubString of "+str+" is : "+subString);
		
		System.out.println("\n..........toLowerCase() Method.........");
		String upperCase = stringOperations.convertToUpperCase(str);
		System.out.println(str+" after using toUpperCase method is : "+upperCase);
		
		System.out.println("\n.........toUpperCase() Method.........");
		String lowerCase = stringOperations.convertToLowerCase(str);
		System.out.println(str+" after using toLowerCase method is : "+lowerCase);
		
		System.out.println("\n.........trim Method..........");
		String trimString = stringOperations.trimMethod(str1);
		int originalLength = str1.length();
		System.out.println("Befor trim method length of "+str1+" is :"+originalLength);
		System.out.println(str1+" after trim method : "+trimString);
		int newLength = trimString.length();
		System.out.println("After trim method length of "+trimString+" is : "+newLength);
		
		System.out.println("\n.........replaceAll() Method..........");
		String repStr = stringOperations.replaceString(str, "The Jbk Academy");
		System.out.println("String before replacement : "+str);
		System.out.println("String after replacement : "+repStr);
		
		System.out.println("\n...........replaceFirst() Method");
		String repFirstStr = str.replaceFirst("The", "JBK");
		System.out.println("replaceFirst :"+repFirstStr);
		
		System.out.println("\n..........contains() Method..........");
		boolean containChar = stringOperations.containMethod(trimString,'r');
		System.out.println(trimString +" contain r : "+containChar);
		
		System.out.println("\n..........equals() Method...........");
		boolean equals = stringOperations.isStringsEquals1(firstStr, secondStr);
		System.out.println(firstStr +" and "+secondStr+ " are equals using equals(): "+equals);
		
		System.out.println("\n..........equalsIgnoreCase() Method...........");
		boolean isEquals = stringOperations.isStringsEquals2(firstStr, secondStr);
		System.out.println(firstStr +" and "+secondStr+ " are equals using equalsIgnoreCase: "+isEquals);
		
		
	}

}
