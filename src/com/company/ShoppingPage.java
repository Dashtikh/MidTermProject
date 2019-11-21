package com.company;

import javax.swing.*;
import java.awt.*;

public class ShoppingPage {
    JFrame frame = new JFrame("Restaurant Management");
    JLabel greeting = new JLabel("hello world", JLabel.CENTER);
    public void Shopping(){




    }
    public void visiblity(boolean a){
        if (a==true) {
            frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("45332.PNG")));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(greeting);
            frame.setSize(1080, 720);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }

    }
}
