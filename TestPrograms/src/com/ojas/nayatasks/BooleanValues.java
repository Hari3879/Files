package com.ojas.nayatasks;

public class BooleanValues {
	public static boolean countBoolean(boolean b1, boolean b2, boolean b3) {
		if (b1 && b2 || b1 && b3 || b2 && b3) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		boolean b = true;boolean  b1 = true;boolean b2 = true ;
	    boolean b3 = true;boolean b4 = true; boolean b5 = false;
	    boolean b6 = true; boolean b7 = false; boolean b8 = false;
	    boolean b9 = false; boolean b10 = false;boolean b11 = false;
	    System.out.println(countBoolean(b, b1, b2));
	    System.out.println(countBoolean(b3, b4, b5));
	    System.out.println(countBoolean(b6, b7, b8));
	    System.out.println(countBoolean(b9, b10, b11));
	}

}
