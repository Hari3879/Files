package com.ojas.newtask;

import java.util.concurrent.TimeUnit;

public class Time {
public static void main(String[] args) {
	StopWatch stopwatch=new StopWatch();
	
	

    long elapsedTime = stopwatch.getElapsedTime();
    if (elapsedTime == -1) {
        System.out.println("Elapsed time: Stopwatch is still running.");
    } else if (elapsedTime < 1000) {
        System.out.println("Elapsed time: " + elapsedTime + " nanoseconds");
    } else if (elapsedTime < 1000000) {
        System.out.println("Elapsed time: " + elapsedTime + " microseconds");
    } else if (elapsedTime < 1000000000) {
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    } else {
        long seconds = TimeUnit.NANOSECONDS.toSeconds(elapsedTime);
        System.out.println("Elapsed time: " + seconds + " seconds");
    }
}
}

