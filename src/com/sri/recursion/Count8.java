package com.sri.recursion;

public class Count8 {

	public int count8(int n) {

		System.out.println(n%100);

		int count = 0;

		if (n % 10 == 8) {
			count++;
		}
		if (n % 100 == 88) {
			count = count + 1;
		}

		if (n / 10 == 0) {

			return count;
		}

		return count + count8(n / 10);
	}

}
