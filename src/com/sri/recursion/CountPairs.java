package com.sri.recursion;

public class CountPairs {

	public int countPairs(String str) {

		int count = 0;

//		if (str.equals("x")) {
//			return 1;
//		}
		if (str.equals("")) {
			return 0;
		}

//		System.out.println(str);

//		System.out.println(str.charAt(str.length() - 1));
//		if (str.length() == 1) {
//			if (str.equals("x")) {
//				count++;
//			}
//			return count;
//		}
//
//		if (str.charAt(str.length() - 1) == 'x') {
//			count++;
//		}

//		System.out.println(str.length());
		if (str.length() > 2 && str.charAt(str.length() - 1) == str.charAt(str.length() - 3)) {
//			System.out.println("found a pair");
			count++;
		}

		return count + countPairs(str.substring(0, str.length() - 1));
	}
}
