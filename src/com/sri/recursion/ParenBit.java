package com.sri.recursion;

public class ParenBit {

	boolean foundclose = false;

	public String parenBit(String str) {

		if (str.equals("") || str.length() < 2) {
			return str;
		}

//		System.out.println(str);
		if (str.length() > 2) {

			if (str.charAt(str.length() - 1) == ')') {
				foundclose = true;
			}

		}

//		System.out.println(str);
		if (str.charAt(str.length() - 1) == '(') {
			foundclose = false;
//			System.out.println(str + "..........");
			return parenBit("(");
		}

		if (foundclose) {

			return parenBit(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1);
		}

		return parenBit(str.substring(0, str.length() - 1));
	}
}
