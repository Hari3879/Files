package com.ojas.nayatasks;

public class AvarageWordslenth {
	public static int getAverageWordLength(String sentence) {
	    if (sentence == null) {
	        return -1;
	    }
	    if (sentence.isEmpty()) {
	        return 0;
	    }
	    String[] words = sentence.split(" ");
	    int sum = 0;
	    int count = 0;
	    for (String word : words) {
	        count++;
	        sum += word.length();
	    }
	    int averageWordLength = sum / count;
	    return averageWordLength;
	}


	public static void main(String[] args) {
		String sentence = "Hi everyone";
		int averageWordLength = getAverageWordLength(sentence);
		System.out.println(averageWordLength); 


	}

}
