package com.sri.recursion;

public class Count7 {

	public int count7(int n) {

//		System.out.println(n%10);

		int count = 0;

		if (n %10 == 7) {
			count++;
		}

		if (n / 10 == 0) {

			return count;
		}

		return count +  count7(n / 10);
	}

}
