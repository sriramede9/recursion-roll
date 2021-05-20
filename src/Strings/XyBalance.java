package Strings;

public class XyBalance {

	public boolean xyBalance(String str) {

		int lastIndexOf2 = str.lastIndexOf("x");
		int lastIndexOf = str.lastIndexOf("y");
		
		System.out.println(lastIndexOf);
		System.out.println(lastIndexOf2);

		if (lastIndexOf == 0 && lastIndexOf2 == 0) {
			return true;
		}

		return lastIndexOf > lastIndexOf2;

	}
}
