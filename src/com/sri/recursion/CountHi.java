package com.sri.recursion;

public class CountHi {

	public int countHi(String str) {

		int count = 0;

		if (str.equals("hi")) {
			return 1;
		}
		if (str.equals("")) {
			return 0;
		}

//		System.out.println(str.substring(str.length() - 2, str.length()));

		if (str.length() == 2) {
			if (str.equals("hi")) {
				count++;
			}
			return count;
		}

		if (str.substring(str.length() - 2, str.length()).equals("hi")) {
			count++;
		}

		return count + countHi(str.substring(0, str.length() - 1));
	}
}
