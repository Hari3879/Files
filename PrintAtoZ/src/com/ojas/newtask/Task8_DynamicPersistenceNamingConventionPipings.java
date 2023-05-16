package com.ojas.newtask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task8_DynamicPersistenceNamingConventionPipings {
public static List<String> records = new ArrayList<String>();

private static int maxLength;

public static File newfile=null;
 static LocalDateTime currentDateTime = null;
static File outputFolder = null;
public static FileWriter fw=null;
 //static LocalTime currentTime = null;
	
public static void printSequence(String prefix, int length) throws Exception {
	if(length==0) {
		//System.out.println(prefix);
		//records.add(prefix);
		fw.write(prefix+"\n");
	}else {
		for(char c='a';c<='z';c++) {
			
			printSequence(prefix+c, length-1);
		}
	}
}
	public static void main(String[] args) throws Exception {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rounds : ");
		Task8_DynamicPersistenceNamingConventionPipings.maxLength= sc.nextInt();
		outputFolder=new File("output");
		outputFolder.mkdir();
		currentDateTime= LocalDateTime.now();
//currentTime=LocalTime.now();
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
	        String formattedDateTime = currentDateTime.format(formatter);
		newfile=new  File( outputFolder,"FileOutput_ "+maxLength+"_"+formattedDateTime+".txt");
		fw = new FileWriter(newfile);
		//int maxLength = sc.nextInt();  
		StopWatch st=new StopWatch();
		st.start();
		
		for (int length = 1; length <= Task8_DynamicPersistenceNamingConventionPipings.maxLength; length++) {
			printSequence("", length); 
			}
		st.stop();
		long elapsedTime = st.getElapsedTime();

	  
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
	    
	    fw.close();
}}
