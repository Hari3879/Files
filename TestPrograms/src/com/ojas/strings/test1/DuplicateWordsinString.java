package com.ojas.strings.test1;

public class DuplicateWordsinString {

	public static void main(String[] args) {
		String str = "hello all how are you all hello mimalney ";
		duplcates(str);

	}

	public static void duplcates(String str) {

		int count = 1;
		str = str.toLowerCase();
		String arr[] = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println(arr[j]);
					
				}
			}
			
		}
	}

}
