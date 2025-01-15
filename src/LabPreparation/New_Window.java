package LabPreparation;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class New_Window extends JFrame implements ActionListener {
    JButton B1;

    New_Window() {
        this.setLayout(new FlowLayout());

        B1 = new JButton();
        B1.setText("Click For New Window");
        B1.setFocusable(false);
        B1.setFont(new Font("Monospaced", Font.BOLD, 30));
        B1.setForeground(Color.MAGENTA);
        B1.setBackground(Color.BLACK);
        B1.addActionListener(this);

        this.setSize(600, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(B1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
            this.dispose();
            new Brand();
        }
    }

    public static void main(String[] args) {
        new New_Window();
    }
}
