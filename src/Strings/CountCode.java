package Strings;

public class CountCode {

	public int countCode(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			if ((str.substring(i, i + 2) + str.charAt(i+3)).equals("coe")) {

				count++;
			}
			System.out.println((str.substring(i, i + 2) + str.charAt(i+3)));
		}

		return count;
	}

}
