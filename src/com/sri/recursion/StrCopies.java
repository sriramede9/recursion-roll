package com.sri.recursion;

public class StrCopies {

	int count = 0;

	public boolean strCopies(String str, String sub, int n) {

//		System.out.println(count);

//		if (str.equals(sub)) {
////			return 1;
//			return n == 1;
//		}
		if (str.equals("")) {
//			System.out.println("I am here");
			if (count == n) {
				count = 0;
				return true;
			} else {
				count = 0;
				return false;
			}
//			return count == n;
		}

//		System.out.println(str.substring(str.length() - 2, str.length()));

		if (str.length() == sub.length()) {
			if (str.equals(sub)) {
				count++;
			}

			if (count == n) {
				count = 0;
				return true;
			} else {
				count = 0;
				return false;
			}

//			return count;
		}

		if (str.length() > sub.length() && str.substring(str.length() - sub.length(), str.length()).equals(sub)) {
			count++;
//			System.out.println(str.substring(0,str.length()-1));

			return strCopies(str.substring(0, str.length() - 1), sub, n);

		}

		return strCopies(str.substring(0, str.length() - 1), sub, n);
	}
}
