package com.ojas.newtask;

public class StopWatch {
	 private long startTime;
	 private long stopTime; 
	 private boolean running;
	 public void start() { 
		 this.startTime = System.currentTimeMillis();
		 System.out.println(startTime);
		 this.running = true; } 
	 public void stop() { 
			 this.stopTime = System.currentTimeMillis();
			 //System.out.println(stopTime);
			 this.running = false; }
		 public long getElapsedTime() {
			 long elapsed;
			 if (running) {
				 elapsed = (System.currentTimeMillis() - startTime); 
				 } else {
					 elapsed = (stopTime - startTime);
				 } return elapsed; 
				 } 
}
