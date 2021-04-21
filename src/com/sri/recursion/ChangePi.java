package com.sri.recursion;

public class ChangePi {

	public String changePi(String str) {

		int count = 0;

		if (str.equals("")) {
			return str;
		}

		if (str.length() == 1) {
			return str;
		}

//		if (str.equals("x")) {
//
//			return "y";
//		}

		if (str.charAt(str.length() - 2) == 'p' && str.charAt(str.length() - 1) == 'i') {

			return changePi(str.substring(0, str.length() - 2) + "3.14");
		}

		return changePi(str.substring(0, str.length() - 1)) + str.substring(str.length() - 1);
	}
}
