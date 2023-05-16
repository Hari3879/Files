package com.ojas.nayatasks;

public class WavedString {
	
	public static String getWeavedString(String value1, String value2) {
	    if (value1 == null || value1.isEmpty() || value2 == null || value2.isEmpty()) {
	        return "-1";
	    }
	    int len1 = value1.length();
	    int len2 = value2.length();
	    if (len1 > len2) {
	        return value2 + value1 + value2;
	    } else if (len1 < len2) {
	        return value1 + value2 + value1;
	    } else {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < len1; i++) {
	            sb.append(value1.charAt(i));
	            sb.append(value2.charAt(i));
	        }
	        return sb.toString();
	    }
	}

	public static void main(String[] args) {
     String v1="hi";
     String v2="hello";
     System.out.println(getWeavedString(v1, v2));

	}

}
