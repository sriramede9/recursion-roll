package com.sri.recursion;

public class ReverseString {

	public String reverse(String string) {

		System.out.println(string);

		if (string.isEmpty()) {
			return string;
		}

//		return string.charAt(string.length() - 1) + reverse(string.substring(0, string.length() - 1));

		return reverse(string.substring(1))+string.charAt(0);
	}

}
