package com.ojas.strings.test1;

public class ReverseAstring {
	// Using charAt predefined method
		static void reverseString1(String s) {
			String rev = "";
			for (int i = 0; i < s.length(); i++) {
				rev = s.charAt(i) + rev;
			}
			System.out.println("Reverse of a given string is :" + rev);
		}

		// Using array of characters
		static void reverseString2(String s) {
			char[] a = s.toCharArray();
			String rev = "";
			for (int i = a.length - 1; i >= 0; i--) {
				rev = rev + a[i];
			}
			System.out.println("Reverse of a given string is :" + rev);

		}

		// Using substring
		static void reverseString3(String s) {
			String res = "";
			
			for (int i = 0; i < s.length(); i++) {
				res = s.substring(i, i + 1) + res;
			}
			System.out.println("Reverse of a given string is :" + res);
		}

		// Using ascii values
		static void reverseString4(String s) {
			int ascii;
			String res = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				ascii = s.charAt(i);
				res += (char) ascii;
			}
			System.out.println("Reverse of a given string is :" + res);
		}

		public static void main(String[] args) {
			String str = "surya";
			reverseString1(str);
			reverseString2(str);
			reverseString3(str);
			reverseString4(str);
		}
	}
