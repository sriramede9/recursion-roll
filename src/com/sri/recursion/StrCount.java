package com.sri.recursion;

public class StrCount {

	public int strCount(String str, String sub) {

		int count = 0;

		if (str.equals(sub)) {
			return 1;
		}
		if (str.equals("")) {
			return 0;
		}

//		System.out.println(str.substring(str.length() - 2, str.length()));

		if (str.length() == sub.length()) {
			if (str.equals(sub)) {
				count++;
			}
			return count;
		}

		if (str.length()>sub.length() && str.substring(str.length() - sub.length(), str.length()).equals(sub)) {
			count++;
//			System.out.println(str.substring(0,str.length()-1));

			return count+ strCount(str.substring(0, str.length() - sub.length()), sub);

		}

		return count + strCount(str.substring(0, str.length() - 1), sub);
	}
}
