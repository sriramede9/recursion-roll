package Strings;

public class EndOther {

	public boolean endOther(String a, String b) {

		if (a.length() > b.length()) {
//			System.out.println(a.substring(b.length()));
			return a.substring(a.length()-b.length(),a.length() ).equalsIgnoreCase(b);
		} else if (a.length() < b.length()) {
			System.out.println(b.substring(b.length()-a.length(),b.length()));
			return b.substring(b.length()-a.length(),b.length()).equalsIgnoreCase(a);

		} else if (a.equals(b)) {
			return true;
		} else
			return false;
	}

}
