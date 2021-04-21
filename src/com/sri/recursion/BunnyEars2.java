package com.sri.recursion;

public class BunnyEars2 {

	public int bunnyEars(int bunnies) {

		if (bunnies == 0) {
			return bunnies;
		}
		if (bunnies % 2 == 0) {
			return 3 + bunnyEars(bunnies - 1);
		} else
			return 2 + bunnyEars(bunnies - 1);
	}

}
