package com.sri.recursion;

public class Nox {

	public String noX(String str) {

		if (str.equals("")) {
			return str;
		}

		if (str.equals("x")) {

			return "";
		}

		if (str.charAt(str.length() - 1) == 'x') {

			return noX(str.substring(0, str.length() - 1) + "");
		}

		return noX(str.substring(0, str.length() - 1)) + str.substring(str.length() - 1);
	}
}
