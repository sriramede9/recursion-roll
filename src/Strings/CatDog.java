package Strings;

import java.util.List;
import java.util.stream.Collectors;

public class CatDog {
	public boolean catDog(String str) {

		int count = 0;
		int count2 = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				count++;
			}
			if (str.substring(i, i + 3).equals("dog")) {
				count2++;
			}
		}

		return count == count2;
	}

	public List<Integer> doubling(List<Integer> nums) {

		return nums.stream().map(x -> x * x).collect(Collectors.toList());
	}

	public List<String> noX(List<String> strings) {
		return strings.stream().map(x -> x.replace("x", "")).collect(Collectors.toList());
	}
}
