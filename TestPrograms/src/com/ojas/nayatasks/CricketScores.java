package com.ojas.nayatasks;
public class CricketScores {
    public static String getDisplayDetails(int runs, float overs) {
        String result;
        if (runs < 100 && overs < 6.0) {
            int ballsRemaining = Math.round(overs * 6);
            result = runs + " runs in " + ballsRemaining + " balls @ " + String.format("%.2f", (float)runs/ballsRemaining) + " runs per ball";
        } else {
            int oversRemaining = (int) overs;
            int ballsRemaining = Math.round((overs - oversRemaining) * 10);
            int totalBallsRemaining = oversRemaining * 6 + ballsRemaining;
            result = runs + " runs in " + oversRemaining + "." + ballsRemaining + " Overs @ " + String.format("%.2f", (float)runs/totalBallsRemaining * 6) + " runs per over";
        }
        return result;
    }
    public static void main(String[] args) {
		System.out.println(getDisplayDetails(20,5));
	}
}
