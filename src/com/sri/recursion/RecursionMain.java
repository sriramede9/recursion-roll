package com.sri.recursion;

import java.util.logging.Logger;

public class RecursionMain {

	private static Logger logger = Logger.getLogger("com.sri.recursion.RecursionMain");

	public static void main(String[] args) {
		Count11 bu = new Count11();
//		String bunnyEars = bu.noX("pix");
//		int a[] = { 1, 2, 3, 6, 11, 11 };
		int bunnyEars = bu.count11("1111");
		logger.info(bunnyEars + "");
	}
}