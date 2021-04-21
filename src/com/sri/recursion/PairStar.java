package com.sri.recursion;

public class PairStar {

	public String pairStar(String str) {

		if (str.isEmpty()) {
			return str;
		}

		if (str.length() == 1) {
			return str;
		}

		if (str.charAt(0) == str.charAt(1)) {
			System.out.println("we found pair");

			return str.charAt(0) + "*" + pairStar(str.substring(1));
		}

		return str.charAt(0) + pairStar(str.substring(1));
	}

}
