package com.sri.recursion;

public class CountABC {

	public int countAbc(String str) {

		int count = 0;

		if (str.equals("")) {
			return 0;
		}

//		System.out.println(str.substring(0, 3));

		if (str.length() > 2 && str.substring(0, 3).equals("abc")) {
//			System.out.println("found a pair");
			count++;
		}
		if (str.length() > 2 && str.substring(0, 3).equals("aba")) {
//			System.out.println("found a pair");
			count++;
		}

		return count + countAbc(str.substring(1));
	}
}
