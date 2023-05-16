package com.ojas.newtask;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Task7_ExternalAppInvoke {


	 public static void openNotepad() {
	        JFileChooser fileChooser = new JFileChooser();
	        // Create a file filter for .txt files
	        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
	        fileChooser.setFileFilter(filter);

	        // Show the file browser dialog
	        int result = fileChooser.showOpenDialog(null);

	        if (result == JFileChooser.APPROVE_OPTION) {
	            File selectedFile = fileChooser.getSelectedFile();

	            try {
	                // Check if Desktop is supported
	                if (Desktop.isDesktopSupported()) {
	                    Desktop desktop = Desktop.getDesktop();

	                    // Check if the selected file has .txt extension
	                    if (selectedFile.getName().toLowerCase().endsWith(".txt")) {
	                        desktop.open(selectedFile);
	                        System.out.println("Notepad opened successfully.");
		                	JOptionPane.showMessageDialog(null, "Notepad opened successfully.");

	                    } else {
	                        System.err.println("Invalid file type. Only .txt files can be opened.");
	                        JOptionPane.showMessageDialog(null, "Invalid file type. Only .txt files can be opened");
	                    }
	                } else {
	                	JOptionPane.showMessageDialog(null, "Desktop is not supported.");
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        } else {
	            System.err.println("No file selected.");
	        }
	    }

	public static void main(String[] args) {
openNotepad();
		 
		 
	}
}
