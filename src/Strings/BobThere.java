package Strings;

public class BobThere {

	public boolean bobThere(String str) {
		boolean isBob = false;

		int lastIndexOf = str.lastIndexOf('b');
		
		isBob = lastIndexOf - 2 >= 0 && str.charAt(lastIndexOf - 2) == 'b';

		return isBob;
	}

}
