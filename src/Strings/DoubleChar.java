package Strings;

public class DoubleChar {

	public String doubleChar(String str) {

		String s2 = "";
		for (int i = 0; i < str.length(); i++) {
			s2 = s2 + str.charAt(i) + str.charAt(i);
		}

		return s2;
	}
}
