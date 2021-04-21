package com.sri.recursion;

public class endX {

	public String endX(String str) {

		if (str.isEmpty()) {
			return str;
		}

		if (str.length() == 1) {
			return str;
		}

		if (str.charAt(0) == 'x' && str.length() > 1) {
			System.out.println("we found pair");

			System.out.println(str.charAt(1) + "x");

			return  endX(str.substring(1)) + "x";

//			return  str.charAt(0)+(str.substring(1));
		}

		return str.charAt(0) + endX(str.substring(1));
	}

}
