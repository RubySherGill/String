package com.tka.StringExample;

public class StringOperations {
	public int getlength(String str) {
		int length = str.length();
		return length;
	}

	public char getSpecificChar(String str, int index) {
		char ch = str.charAt(index);
		return ch;
	}

	public String getSubString(String str, int beginIndex, int endIndex) {
		String subString = str.substring(beginIndex, endIndex);
		return subString;
	}

	public String convertToUpperCase(String str) {
		String uppercase = str.toUpperCase();
		return uppercase;
	}

	public String convertToLowerCase(String str) {
		String lowercase = str.toLowerCase();
		return lowercase;
	}

	public String trimMethod(String str1) {
		String trimString = str1.trim();
		return trimString;
	}
	
	public String replaceString(String str ,String newString) {
		String repStr = str.replaceAll(str, newString);
		return repStr;
	}
	
	public String replaceFirstString(String str, String newString) {
		String repFirstStr = str.replaceFirst(str, newString);
		return repFirstStr;
	}
	
	public boolean containMethod(String str1,char ch) {
		boolean containchar = str1.contains(str1);
		return containchar;
	}
	
	public boolean isStringsEquals1(String str1 , String str2 ) {
		boolean equals = str1.equals(str2);
		return equals;
	}
	
	public boolean isStringsEquals2(String str1 , String str2 ) {
		boolean isEqual = str1.equalsIgnoreCase(str2);
		return isEqual;
	}
}
