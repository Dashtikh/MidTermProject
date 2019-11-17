package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> new Main().Startup());
    }
     public void Startup(){
        JLabel greeting = new JLabel("hello world",JLabel.CENTER);
        JFrame frame = new JFrame("important message !");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("45332.PNG")));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(greeting);
        frame.setSize(240,160);
        frame.setVisible(true);


    }
}
