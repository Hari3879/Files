package com.ojas.strings.test1;

public class ReplaceEachOther {
	static String replaceEachOther(String s) {
	String res = "";
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i) == 'b')
			res += 'f';
		else if (s.charAt(i) == 'f')
			res += 'b';
		else
			res += s.charAt(i);
	}
	return res;
}

public static void main(String[] args) {
	String str = "afbcedf";
	System.out.println("After replacing b with f : " + replaceEachOther(str));
}
}

