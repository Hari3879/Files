package com.ojas.newtask;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class NotepadOpener {
    public static void main(String[] args) {
        String filePath = JOptionPane.showInputDialog(null, "Enter the file path:");

        if (filePath != null && !filePath.isEmpty()) {
            try {
                openChrome(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Invalid file path.");
        }
    }

    public static void openChrome(String filePath) throws IOException, InterruptedException {
        String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";

        Process p = Runtime.getRuntime().exec("\"" + chromePath + "\" " + filePath);
        p.waitFor();
        System.out.println("Google Chrome launched!");
    }
}

