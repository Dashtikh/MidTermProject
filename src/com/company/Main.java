package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Dashtikh","dashti1565");
        PreparedStatement preparedStatement = connection.prepareStatement("insert into Users (id,username,password) values (?,?,?)");
        preparedStatement.setLong(1, 2);
        preparedStatement.setString(2, "parham");
        preparedStatement.setLong(3, 1234);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();*/
        //SwingUtilities.invokeLater(()-> new Main().Startup());
        SwingUtilities.invokeLater(()-> new Loginpage());

    }


    public void Startup(){
        JLabel greeting = new JLabel("hello world",JLabel.CENTER);

        JFrame frame = new JFrame("Restaurant Management");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("45332.PNG")));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(greeting);
        frame.setSize(1080,720);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);


    }
}
