package com.ojas.newtask;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task9_Alpha_And_Numeros_Rounds_CodeGen_Enhancement {
    private static int maxLength;
    private static LocalDateTime currentDateTime;
    private static File outputFolder;
    private static FileWriter alphabetFileWriter;
    private static FileWriter numericFileWriter;

    public static void printAlphabetSequence(String prefix, int length) throws IOException {
        if (length == 0) {
            alphabetFileWriter.write(prefix + "\n");
        } else {
            for (char c = 'a'; c <= 'z'; c++) {
                printAlphabetSequence(prefix + c, length - 1);
            }
        }
    }

    public static void printNumericSequence(String prefix, int length) throws IOException {
        if (length == 0) {
            numericFileWriter.write(prefix + "\n");
        } else {
            for (int i = 1; i <= 9; i++) {
                printNumericSequence(prefix + i, length - 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rounds: ");
        maxLength = sc.nextInt();

        outputFolder = new File("output");
        outputFolder.mkdir();

        currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
        String formattedDateTime = currentDateTime.format(formatter);

        File alphabetFile = new File(outputFolder, "AlphabetOutput_" + maxLength + "_" + formattedDateTime + ".txt");
        File numericFile = new File(outputFolder, "NumericOutput_" + maxLength + "_" + formattedDateTime + ".txt");

        alphabetFileWriter = new FileWriter(alphabetFile);
        numericFileWriter = new FileWriter(numericFile);

        StopWatch st = new StopWatch();
//        st.start();

        for (int length = 1; length <= maxLength; length++) {
            printAlphabetSequence("", length);
            printNumericSequence("", length);
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

        alphabetFileWriter.close();
        numericFileWriter.close();
    }
}
