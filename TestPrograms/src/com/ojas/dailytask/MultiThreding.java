package com.ojas.dailytask;

public class MultiThreding extends Thread {
	
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("thread class");
		}
	}
public static void main(String[] args) {
	MultiThreding t1=new MultiThreding();
	t1.run();
	for(int i=1;i<5;i++) {
		System.out.println("main class");
	}
}
}
