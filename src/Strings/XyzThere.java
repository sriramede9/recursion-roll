package Strings;

public class XyzThere {

	public boolean xyzThere(String str) {
		
		if(str.contains(".xyz")) {
			int indexOf = str.lastIndexOf(".xyz");
			
//			System.out.println(str.substring(indexOf+4));
			
			if(str.length()>indexOf+4 && str.substring(indexOf+4).contains("xyz")) {
				return true;
			}
			
			return false;
			
		}
		
		if(str.contains("xyz")){
		  return true;
		}

		return false;
	}
}
