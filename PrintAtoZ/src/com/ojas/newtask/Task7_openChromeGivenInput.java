package com.ojas.newtask;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFileChooser;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Task7_openChromeGivenInput {
    public static void main(String[] args) {
    	String defaultURL = "http://192.168.7.48/Bonobo.Git.Server/proj203.git";
        String filePath = JOptionPane.showInputDialog(null, "Enter the file path:",defaultURL);

        if (filePath != null && !filePath.isEmpty()) {
            try {
                URL url = new URL(filePath);
                openChrome(url.toString());
            } catch (MalformedURLException e) {
//                System.err.println("Invalid URL.");
            	JOptionPane.showMessageDialog(null, "Invalid Url");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
        	JOptionPane.showMessageDialog(null, "Enter the valid Url");
        }
    }

    public static void openChrome(String filePath) throws IOException, InterruptedException {
        String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";

        Process p = Runtime.getRuntime().exec("\"" + chromePath + "\" " + filePath);
        p.waitFor();
        System.out.println("Google Chrome launched!");
    }
}

