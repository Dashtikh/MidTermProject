package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Loginpage {
    public boolean uCheck(String a){
        if (a!=null&&a.equals("Dashtikh")){
            return true;
        }else return false;
    }
    public boolean pCheck(String b){
        if (b!=null&&b.equals("dashti1565")){
            return true;
        }else return false;

    }




}
