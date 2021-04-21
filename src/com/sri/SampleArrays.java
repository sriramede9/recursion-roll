package com.sri;

public class SampleArrays {

	public static int sum677(int[] nums) {

		int sum = 0;

		// find 6 and then 7
		// also check 7+1 is 7 or not

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) {
				System.out.println("index of 6" + i);
				for (int j = i; j < nums.length; j++) {
					if (nums[j] == 7) {
						System.out.println("index of 7" + j);
						break;
					}
				}
			} else {
				System.out.println(nums[i]);
			}
		}

		return sum;
	}

	public static int sum67(int[] nums) {

		int sum = 0;

		// skip from 6-7

		int indexof6 = 0;
		int indexof7 = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
//first occurence of 6
			// occurence of 7

			if (nums[i] == 6 && indexof6 == 0) {
				indexof6 = i;
			}
			if (nums[i] == 7 && indexof7 < nums.length) {
				indexof7 = i;
			}
		}
		System.out.println(indexof6);
		System.out.println(indexof7);

		if ((indexof7 > indexof6) && (indexof7 == nums.length - 1)) {
			for (int i = 0; i < indexof6; i++) {
				sum = sum + nums[i];
			}
		}
		if (indexof7 == indexof6) {
			for (int k : nums) {
				sum = sum + k;
//				System.out.println(k);
			}
		}

		if ((indexof7 > indexof6) && (indexof7 < nums.length - 1)) {
			// i have more after 7
			for (int i = 0; i < indexof6; i++) {
				sum = sum + nums[i];
			}

			for (int j = indexof7 + 1; j <= nums.length - 1; j++) {

				sum = sum + nums[j];
			}
		}

		return sum;
	}

	public static int sum67sol(int[] nums) {

		int sum = 0;
		boolean stop = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6)
				stop = true;
			if (stop == false)
				sum += nums[i];
			if (nums[i] == 7 && stop == true)
				stop = false;
		}
		return sum;
	}

}