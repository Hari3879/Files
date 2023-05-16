package com.ojas.newtask;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;


public class App {

	private static void printFiles(File[] files) {
		for (File file : files) {                 

			System.out.println(file.length() + "\t" + file.getName());
		}
		System.out.println("\n************************\n");
	}

	public static File[] sortByLengthApproach1(String directoryPath) {
		File directory = new File(directoryPath);

		File[] files = directory.listFiles();

		Arrays.sort(files, new FileSizeComparator());
		return files;
	}

	public static File[] sortByLengthApproach2(String directoryPath) {
		File directory = new File(directoryPath);

		File[] files = directory.listFiles();
		Arrays.sort(files, Comparator.comparingLong(File::length));
		return files;
	}

	public static void main(String[] args) {
		String directoryPath = "output";

		File[] files1 = sortByLengthApproach1(directoryPath);
		//File[] files2 = sortByLengthApproach2(directoryPath);

		printFiles(files1);
		//printFiles(files2);
		
		System.out.println(files1[files1.length-1]);
		System.out.println(files1[files1.length-2]);
		
		  
	}

}
