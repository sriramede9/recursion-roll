package com.sri.recursion;

public class Count11 {

	public int count11(String str) {

		int count = 0;

		if (str.equals("")) {
			return 0;
		}
		if (str.length() == 1) {
			return count;
		}

		if (str.length() > 1 && str.substring(0, 2).equals("11")) {

			count++;
			return count + count11(str.substring(2));

		}

		return (count) + count11(str.substring(1));
	}
}
