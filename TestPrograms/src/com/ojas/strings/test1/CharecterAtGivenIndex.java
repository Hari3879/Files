package com.ojas.strings.test1;

public class CharecterAtGivenIndex {
	public static void indexValue( String Str,int a) {
 //System.out.println(Str.lines());
		
		System.out.println("given strin "+Str  +  "given index value"+a);
  System.out.println("charecter at index position "+Str.charAt(a));
  
		
		
	}

	public static void main(String[] args) {
		String str="helloall";
		indexValue(str, 3);
		

	}

}
