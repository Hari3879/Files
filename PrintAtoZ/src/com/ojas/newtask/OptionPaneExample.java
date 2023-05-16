package com.ojas.newtask;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneExample {  
JFrame f;  
OptionPaneExample(){  
    f=new JFrame();   
    String name=JOptionPane.showInputDialog(f,"Enter Name");      
}   }