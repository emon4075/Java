package LabPreparation;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener {
    JButton B1, B2, B3;

    Main() {
        this.setLayout(new FlowLayout());

        B1 = new JButton();
        B1.setFont(new Font("Monospaced", Font.PLAIN, 30));
        B1.setText("Yellow");
        B1.setFocusable(false);
        B1.addActionListener(this);

        B2 = new JButton();
        B2.setFont(new Font("Monospaced", Font.PLAIN, 30));
        B2.setText("Green");
        B2.setFocusable(false);
        B2.addActionListener(this);

        B3 = new JButton();
        B3.setFont(new Font("Monospaced", Font.PLAIN, 30));
        B3.setText("Red");
        B3.setFocusable(false);
        B3.addActionListener(this);

        this.setSize(600, 600);
        this.setTitle("Background Changer");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(B1);
        this.add(B2);
        this.add(B3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
            this.getContentPane().setBackground(Color.YELLOW);
        }
        if (e.getSource() == B2) {
            this.getContentPane().setBackground(Color.GREEN);
        }
        if (e.getSource() == B3) {
            this.getContentPane().setBackground(Color.RED);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}