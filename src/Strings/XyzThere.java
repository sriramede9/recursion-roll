package Strings;

public class XyzThere {

	public boolean xyzThere(String str) {
		
//	for(int i=0;i<=str.length()-4;i++) {
//		System.out.println(str.substring(i,i+4));
//	}
		
		if(str.contains(".xyz")) {
			int indexOf = str.indexOf(".xyz");
			
			if(str.length())
			
			System.out.println(str.substring(indexOf+4));
		}

		return false;
	}
}
