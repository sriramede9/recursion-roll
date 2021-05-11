package Strings;

import java.util.List;
import java.util.stream.Collectors;

public class CountCode {

	public int countCode(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			if ((str.substring(i, i + 2) + str.charAt(i + 3)).equals("coe")) {

				count++;
			}
			System.out.println((str.substring(i, i + 2) + str.charAt(i + 3)));
		}

		return count;
	}

	public List<String> no34(List<String> strings) {
		return strings.stream().filter(x -> !(x.length() == 3 || x.length() == 4)).collect(Collectors.toList());
	}

	public List<String> noYY(List<String> strings) {

		return strings.stream().map(x -> x + "y").filter(x -> !(x.contains("yy"))).collect(Collectors.toList());
	}
	
	public List<Integer> two2(List<Integer> nums) {
	
		return nums.stream().map(n -> n*2).filter(n-> n%10!=2).collect(Collectors.toList());
	}
	
	public List<Integer> square56(List<Integer> nums) {

		return nums.stream().map(n -> (n*n)+10).filter(n-> !(n%10==5 || n%10 ==6 )).collect(Collectors.toList());
  
}
}
