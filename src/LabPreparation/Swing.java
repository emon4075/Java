package LabPreparation;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swing extends JFrame implements ActionListener {

    JTextField TF;
    JButton B1;
    JTextArea TA;
    JLabel L1;

    Swing() {
        this.setLayout(new FlowLayout());

        L1 = new JLabel();
        L1.setText("Enter Your Name: ");
        L1.setFont(new Font("Monospaced", Font.BOLD, 30));

        TF = new JTextField(30);
        TF.setFont(new Font("Monospaced", Font.BOLD, 30));
        TF.setForeground(Color.GREEN);
        TF.setBackground(Color.BLACK);
        TF.addActionListener(this);

        B1 = new JButton();
        B1.setText("Submit");
        B1.setFont(new Font("Monospaced", Font.BOLD, 30));
        B1.addActionListener(this);
        B1.setFocusable(false);
        B1.setForeground(Color.GREEN);
        B1.setBackground(Color.BLACK);

        TA = new JTextArea(5, 30);
        TA.setFont(new Font("Monospaced", Font.BOLD, 30));
        TA.setForeground(Color.GREEN);
        TA.setBackground(Color.BLACK);
        TA.setEditable(false);

        this.setSize(600, 600);
        this.setTitle("File IO");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.GREEN);

        this.add(L1);
        this.add(TF);
        this.add(B1);
        this.add(TA);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
            String S = TF.getText();
            char[] C = S.toCharArray();
            int j = C.length - 1;
            int i = 0;
            boolean isPalindrome = true;
            while (i < j) {
                if (C[i] != C[j]) {
                    isPalindrome = false;
                    break;
                }
                i++;
                j--;
            }
            if (isPalindrome) {
                TA.setText("Palindrome");
            } else {
                TA.setText("Not a Palindrome");
            }
        }
    }

    public static void main(String[] args) {
        new Swing();
    }
}
