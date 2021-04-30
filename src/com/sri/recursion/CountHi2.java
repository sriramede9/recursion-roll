package com.sri.recursion;

public class CountHi2 {

	public int countHi2(String str) {

		int count = 0;

		if (str.equals("hi")) {
			return 1;
		}
		if (str.equals("") || str.length() <= 1) {
			return 0;
		}

		if (str.length() > 2) {

//			System.out.println(str.substring(str.length() - 3, str.length()));
			if (str.substring(str.length() - 3, str.length()).equals("xhi")) {
//				System.out.println("found xhi");
				count--;
			}
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

		return count + countHi2(str.substring(0, str.length() - 1));
	}
}
