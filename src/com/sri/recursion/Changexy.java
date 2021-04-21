package com.sri.recursion;

public class Changexy {

	public String changeXY(String str) {

		int count = 0;

		if (str.equals("")) {
			return str;
		}

		if (str.equals("x")) {

			return "y";
		}

		if (str.charAt(str.length() - 1) == 'x') {


			return changeXY(str.substring(0, str.length() - 1) + "y");
		}

		return changeXY(str.substring(0, str.length() - 1)) + str.substring(str.length() - 1);
	}
}
