package com.sri.recursion;

public class CountX {

	public int countX(String str) {

		int count = 0;

		if (str.equals("x")) {
			return 1;
		}
		if (str.equals("")) {
			return 0;
		}

//		System.out.println(str.charAt(str.length() - 1));
		if (str.length() == 1) {
			if (str.equals("x")) {
				count++;
			}
			return count;
		}

		if (str.charAt(str.length() - 1) == 'x') {
			count++;
		}

		return count + countX(str.substring(0, str.length() - 1));
	}
}
