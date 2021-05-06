package com.sri.recursion;

import java.util.logging.Logger;

public class RecursionMain {

	private static Logger logger = Logger.getLogger("com.sri.recursion.RecursionMain");

	public static void main(String[] args) {
		StrCopies bu = new StrCopies();
//		String bunnyEars = bu.noX("pix");
//		int a[] = { 1, 2, 3, 6, 11, 11 };
//		int bunnyEars = bu.strCount("cacatcowcat", "cat");
		boolean bunnyEars = bu.strCopies("ijiiiiij", "iiii", 3);
		logger.info(bunnyEars + "");
	}
}