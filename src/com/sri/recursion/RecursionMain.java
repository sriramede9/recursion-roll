package com.sri.recursion;

import java.util.logging.Logger;

public class RecursionMain {

	private static Logger logger = Logger.getLogger("com.sri.recursion.RecursionMain");

	public static void main(String[] args) {
		CountABC bu = new CountABC();
//		String bunnyEars = bu.noX("pix");
//		int a[] = { 1, 2, 3, 6, 11, 11 };
		int bunnyEars = bu.countAbc("ab");
		logger.info(bunnyEars + "");
	}
}