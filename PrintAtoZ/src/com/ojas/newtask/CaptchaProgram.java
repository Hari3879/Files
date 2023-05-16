package com.ojas.newtask;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class CaptchaProgram extends JFrame {
    private static final long serialVersionUID = 1L;

    private JLabel captchaLabel;
    private JTextField captchaTextField;
    private JButton verifyButton;

    private String captcha;
    private Random random;

    public CaptchaProgram() {
        setTitle("CAPTCHA Program");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        captchaLabel = new JLabel();
        captchaTextField = new JTextField();
        verifyButton = new JButton("Verify");
        random = new Random();

        generateCaptcha();

        captchaTextField.setColumns(10);
        captchaLabel.setFont(new Font("Arial", Font.BOLD, 24));
        verifyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userInput = captchaTextField.getText();
                if (userInput.equals(captcha)) {
                    JOptionPane.showMessageDialog(CaptchaProgram.this, "Verification Successful!");
                    generateCaptcha();
                } else {
                    JOptionPane.showMessageDialog(CaptchaProgram.this, "Verification Failed!");
                }
                captchaTextField.setText("");
            }
        });

        setLayout(new FlowLayout());
        add(captchaLabel);
        add(captchaTextField);
        add(verifyButton);
    }

    private void generateCaptcha() {
        StringBuilder captchaBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int digit = random.nextInt(10);
            captchaBuilder.append(digit);
        }
        captcha = captchaBuilder.toString();
        captchaLabel.setText(captcha);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CaptchaProgram captchaProgram = new CaptchaProgram();
                captchaProgram.setVisible(true);
            }
        });
    }
}
