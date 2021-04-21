package com.sri.recursion;

public class AllStar {

	public String allStar(String str) {
		
		if(str.isEmpty()) {
			return str;
		}

		if (str.length() == 1) {
			return str;
		}

		return str.charAt(0) + "*" + allStar(str.substring(1));
	}

}
