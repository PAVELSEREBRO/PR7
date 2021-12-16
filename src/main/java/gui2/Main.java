package gui2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel{

    Image img = new ImageIcon("/images/tape.png").getImage();

    public static void main(String[] args){
        JFrame fr = new JFrame();
//устанавливаем абсолюбтное позиционирование на фрейме
        fr.setLayout(null);
        fr.setSize(500,500);

        Main m = new Main();
//устанавливаем размеры и координаты компонента для размещения в родителя с абсолютным позиционированием
        m.setBounds(0,0,500,500);
        fr.add(m);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
}