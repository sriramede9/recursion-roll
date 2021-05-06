package Strings;

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
}
