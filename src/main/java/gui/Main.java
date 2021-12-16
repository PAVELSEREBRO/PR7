package gui;


import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel primary = new JPanel();
        primary.setBackground(Color.GREEN);
        primary.setPreferredSize(new Dimension(250,75));
        JLabel label1 = new JLabel("Kizaru and Big Baby Tape");

        primary.add(label1);

        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    }
}