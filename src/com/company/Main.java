package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicReference;

import static javax.swing.JOptionPane.showMessageDialog;

public class Main {

    private String name;
    private int a;
    private int b;
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    Loginpage loginpage = new Loginpage();
    JButton btnlogin = new JButton("Login");
    JButton btncreateuser = new JButton("create user !");
    ShoppingPage shoppingPage = new ShoppingPage();
    JFrame jFrame = new JFrame("Login Page");


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        ShoppingPage shoppingPage = new ShoppingPage();
        SwingUtilities.invokeLater(() -> new Main().LoginStartUp());


    }

    public void LoginStartUp() {



        JTextField uname = new JTextField();
        JTextField p = new JTextField();

        username.setBorder(BorderFactory.createTitledBorder("Username"));
        password.setBorder(BorderFactory.createTitledBorder("password"));
        uname.setBorder(BorderFactory.createTitledBorder("choose Username"));
        p.setBorder(BorderFactory.createTitledBorder("choose password"));

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

        btnlogin.addActionListener(e->Usernamesender() );
        btncreateuser.addActionListener(e->jFrame.setVisible(false));
        btncreateuser.addActionListener(e->shoppingPage.visiblity(true));






    }
    public void Usernamesender(){
        String name=username.getText();
        if (loginpage.uCheck(name)==true)a=1;
        String pass=password.getText();
        if (loginpage.pCheck(pass)==true)b=1;
        if (a+b==2){
            jFrame.setVisible(false);
            shoppingPage.visiblity(true);

        }else {
            showMessageDialog(null, "Incorrect user/pass");
        }



    }

}


