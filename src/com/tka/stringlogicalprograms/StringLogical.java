package com.tka.stringlogicalprograms;

public class StringLogical {
	public static void main(String[] args) {
		String name = "Myrub JBK";
		int length = 0;
		int count = 0;
		int vowelscount = 0;
		int consonentcount = 0;
		// char ch;

		for (int i = 0; i < name.length(); i++) {
			length++;
		}
		System.out.println("Length of " + name + " :" + length);

		System.out.println("Reverse String");
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}

		System.out.println("\nTotal no. of Character");
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				vowelscount++;
			} else {
				consonentcount++;
			}
		}
		System.out.println("Vowels count : " + vowelscount);
		System.out.println("Consonents count : " + consonentcount);

	}

}
