package com.sri.recursion;

public class Triangle {

	public int triangle(int rows) {

		if(rows==0) {
			return 0;
		}
		if(rows ==1) {
			return 1;
		}
		
		return rows+triangle(rows-1);
	}

}
