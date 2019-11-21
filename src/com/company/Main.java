package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    private String name;
    private int a;
    private int b;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        SwingUtilities.invokeLater(() -> new Main().LoginStartUp());

    }

    public void LoginStartUp() {

        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();
        JTextField uname = new JTextField();
        JTextField p = new JTextField();
        JFrame jFrame = new JFrame("Login Page");
        username.setBorder(BorderFactory.createTitledBorder("Username"));
        password.setBorder(BorderFactory.createTitledBorder("password"));
        uname.setBorder(BorderFactory.createTitledBorder("choose Username"));
        p.setBorder(BorderFactory.createTitledBorder("choose password"));
        JButton btnlogin = new JButton("button");
        JButton btncreateuser = new JButton("create user !");
        JPanel mainpanel = new JPanel(new GridLayout(0, 1, 8, 8));
        mainpanel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        mainpanel.add(username);
        mainpanel.add(password);
        mainpanel.add(btnlogin);
        mainpanel.add(uname);
        mainpanel.add(p);
        mainpanel.add(btncreateuser);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.add(mainpanel);
        ShoppingPage shoppingPage = new ShoppingPage();
        btnlogin.addActionListener(e -> jFrame.setVisible(false));
        btnlogin.addActionListener(e->shoppingPage.visiblity(true));




    }
}


