package com.sri.recursion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyStringBuffer implements Appendable, CharSequence {

	List<CharSequence> csList = new ArrayList<CharSequence>();

	public MyStringBuffer(List<CharSequence> csList) {
		super();
		this.csList = csList;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appendable append(CharSequence csq) throws IOException {
		// TODO Auto-generated method stub
		// String a="a";
		// String b= "b";
		// sb.append(a)
		// sb.append(b);
		// syso(sb.toString());ab

		// arrayx
		// queue or stack
//		List<CharSequence> csList = new ArrayList<CharSequence>();

		csList.add(csq);

//		MyStringBuffer myBuffer = new MyStringBuffer(csList);

		return this;
	}
	// appendable

	@Override
	public Appendable append(CharSequence csq, int start, int end) throws IOException {
		// TODO Auto-generated method stub
		CharSequence subSequence = csq.subSequence(start, end);
		
		csList.add(subSequence);
		
		return this;
	}

	@Override
	public Appendable append(char c) throws IOException {
		// TODO Auto-generated method stub
		String s = "" + c;
		//
		// add it to the list
		csList.add(s);
		return this;

//		return null;
	}

}
