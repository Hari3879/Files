package com.ojas.nayatasks;

import java.util.Scanner;

public class CricketScore2 {

	public static String getDisplayDetails(int runs, float overs) {
		String displayDetails;

		if (runs < 100 ) {
			int balls = Math.round(overs * 6);
			displayDetails = runs + " runs in " + balls + " balls @ " + String.format("%.2f", runs / (float) balls)
					+ " runs per ball";
		} else {
			
			float requiredRate = runs / (float) overs;
			displayDetails = runs + " runs in " + overs  + " Overs @ "
					+ String.format("%.2f", requiredRate) + " runs per over";
		}

		return displayDetails;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter runs");
		int runs = sc.nextInt();
		System.out.println("enter overs");

		int overs = sc.nextInt();
		System.out.println(getDisplayDetails(runs,overs));
	}

}
