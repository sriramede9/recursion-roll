package Strings;

public class MixString {

	public String mixString(String a, String b) {
		
		String mixString="";
		
		for(int i=0,j=0;i<a.length()&&j<b.length() ;i++,j++) {
//			System.out.print(a.charAt(i)+""+b.charAt(j));
			mixString=mixString+a.charAt(i)+""+b.charAt(j);
		}
		
		if(a.length()<b.length()) {
			mixString=mixString+b.substring(a.length());
		}
			if(b.length()<a.length()) {
			mixString=mixString+a.substring(b.length());
		}
		
		return mixString;
	}

}
