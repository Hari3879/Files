package com.ojas.newtask;

import java.io.File;
import java.io.IOException;

public class Task6_BdSplitExternalApis {
	public static void openNotePad(String filePath) {
		
		Runtime rs = Runtime.getRuntime();
		try {
			rs.exec("notepad "+filePath);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public static void openChrome(String Path) throws IOException, InterruptedException {
		Process p = Runtime.getRuntime().exec("\"C:\\Program Files\\Google\\Chrome\\Application/chrome.exe\" "+Path);
		p.waitFor();
		System.out.println("Google Chrome launched!");

	}

	public static void openFileSpliter() throws IOException, InterruptedException {
		Process p = Runtime.getRuntime()
				.exec("\"D:\\OpsaProject\\OILC_PoCs-\\PrintAtoZ/Free-File-Splitter-v5.0.1189.exe\"");
		p.waitFor();
		System.out.println("Free-File-Splitter launched!");

	}

	public static void main(String[] args) throws IOException, InterruptedException {
        String path="http://192.168.7.48/Bonobo.Git.Server/proj203.git";
        String filePath = "C:/Users/ho22078/OneDrive - Ojas Innovative Technologies Pvt Lt/Desktop/hari.txt";
        File f = new File(filePath);
        System.out.println("--->"+f.exists());
        openNotePad(filePath);
        openChrome(path);
        openFileSpliter();
    }
//         openNotePad();
//		 openChrome();
		
	
}
