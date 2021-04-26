package com.sri.recursion;

public class Count11 {

	public int count11(String str) {

		int count = 0;
		int count2 = 0;

		if (str.equals("")) {
			return 0;
		}
//		if (str.equals("11")) {
//			count++;
//		}

		if (str.length() > 1 && str.substring(0, 2).equals("11")) {

			count++;

		}

//		if (str.length() > 2 && str.substring(0, 3).equals("111")) {
////			System.out.println(str.substring(0, 3));
//			count2++;
////			System.out.println(count);
//		}

		return (count - count2) + count11(str.substring(1));
	}
}
