package com.sri.recursion;

public class Array11 {

	public int array11(int[] nums, int index) {

		int count = 0;

		if (index >= nums.length) {
			return count;
		}

		if (nums[index] == 11) {
			count++;
		}

		return count + array11(nums, index + 1);
	}

}
