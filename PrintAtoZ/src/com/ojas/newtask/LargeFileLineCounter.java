package com.ojas.newtask;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeFileLineCounter {
    public static void main(String[] args) {
        String filePath = "D:\\OpsaProject\\OILC_PoCs-\\PrintAtoZ\\output/AlphabetOutput_1_2023_05_15_12_15_03.txt";
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                // Process each line as needed
                // ...
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Total line count: " + lineCount);
    }
}
