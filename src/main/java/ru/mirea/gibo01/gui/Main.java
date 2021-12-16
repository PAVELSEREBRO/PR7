package ru.mirea.gibo01.pr7;
import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Привет, Мир!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // создаем первую панель
        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(250, 75));
        panel1.setBackground(Color.GRAY);
        JLabel label1 = new JLabel("Wassup tomboy");
        panel1.add(label1);
        // создаем вторую панель
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(100, 25));
        panel2.setBackground(Color.YELLOW);
        JLabel label2 = new JLabel("Wassup baby boy");
        panel2.add(label2);
        // добавляем primary панель
        JPanel primary = new JPanel();
        primary.setBackground(Color.BLACK);

        primary.add(panel1);
        primary.add(panel2);
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    }
}