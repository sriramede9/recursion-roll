package com.sri.recursion;

public class SumDigits {

	public int sumDigits(int n) {
		
//		System.out.println(n);

		if (n / 10 == 0) {
			return n;
		}

		return (n % 10) + sumDigits(n / 10);
	}

}
