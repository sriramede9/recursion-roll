package com.sri.recursion;

public class NestParen {

	int countopen = 0;
	int countclose = 0;

	public boolean nestParen(String str) {

		if (str.length() < 1) {
			return countopen == countclose;
		}

		if (str.charAt(0) == '(') {
			countopen++;
			return nestParen(str.substring(1));
		}
		if (str.charAt(str.length() - 1) == ')') {
			countclose++;
			return nestParen(str.substring(0, str.length() - 1));
//			System.out.println("found close");
		}

		return nestParen(str.substring(0, str.length() - 1));
	}
}
