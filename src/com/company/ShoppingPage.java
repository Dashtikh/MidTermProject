package com.company;

import org.apache.commons.logging.impl.Jdk13LumberjackLogger;

import javax.swing.*;
import java.awt.*;
import java.io.FileOutputStream;

public class ShoppingPage {
    int orderprice=0;
    JFrame frame = new JFrame("Restaurant Management");
    Icon icon = new ImageIcon("D:\\adv pro\\Learning Swing\\MidTermProject\\src\\com\\company\\bg.jpg");
    JLabel Background = new JLabel(icon, JLabel.CENTER);
    JLabel East = new JLabel("east", JLabel.CENTER);

    JPanel MainPanel = new JPanel(new BorderLayout(8,8));
    JLabel Restaurant = new JLabel("Restaurant", JLabel.CENTER);
    JPanel WestPanel = new JPanel(new BorderLayout());
    JPanel Centerpanel = new JPanel(new GridLayout(2,1));
    JPanel Centerup = new JPanel(new GridLayout(6,2));
    JPanel Centerdown = new JPanel(new GridLayout(1,3));
    JLabel Sandwich = new JLabel("Sandwich",JLabel.CENTER);
    JPanel WestCenter = new JPanel(new GridLayout(4,2));
    JPanel Eastpanel = new JPanel();
    JLabel Thx = new JLabel("       ", JLabel.CENTER);
    JLabel Drinks = new JLabel("Drinks",JLabel.RIGHT);
    JLabel Drinks1 = new JLabel("  ");
    JCheckBox FishSandwich = new JCheckBox("Fish Sandwich");
    JCheckBox CheeseSandwich = new JCheckBox("Cheese Sandwich");
    JCheckBox ChickenSandwich = new JCheckBox("Chicken Sandwich");
    JCheckBox MeatSandwich = new JCheckBox("Meat Sandwich");
    JLabel Fishnum = new JLabel("1",JLabel.CENTER);
    JLabel Cheesenum = new JLabel("2",JLabel.CENTER);
    JLabel Chickennum = new JLabel("3",JLabel.CENTER);
    JLabel Meatnum = new JLabel("4",JLabel.CENTER);
    JButton btnTotal = new JButton("Total");
    JButton btnReset = new JButton("Reset");
    JButton btnExit = new JButton("Exit!");
    JCheckBox Tea = new JCheckBox("Tea");
    JCheckBox Soda = new JCheckBox("Soda");
    JCheckBox Coffee = new JCheckBox("Coffee");
    JCheckBox Orange = new JCheckBox("Orange");
    JCheckBox Bottlewater = new JCheckBox("Bottlewater");
    JLabel Teamnum = new JLabel("1",JLabel.CENTER);
    JLabel Sodanum = new JLabel("2",JLabel.CENTER);
    JLabel Coffeenum = new JLabel("3",JLabel.CENTER);
    JLabel Orangenum = new JLabel("4",JLabel.CENTER);
    JLabel Bottlewaternum = new JLabel("5",JLabel.CENTER);

    public void Shopping(){
    }
    public void visiblity(boolean a){
        if (a==true) {
            frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("45332.PNG")));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Restaurant.setFont(new Font("sansserif", Font.PLAIN, 60));
            Sandwich.setFont(new Font("asas", Font.PLAIN,40));
            Drinks.setFont(new Font("assas",Font.PLAIN,40));
            Thx.setFont(new Font("paiin",Font.PLAIN,50));
            frame.setSize(1080, 720);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.add(MainPanel);
            MainPanel.add(Restaurant,BorderLayout.NORTH);
            MainPanel.add(WestPanel,BorderLayout.WEST);
            MainPanel.add(Centerpanel,BorderLayout.CENTER);
            MainPanel.add(Thx,BorderLayout.SOUTH);
            MainPanel.add(Eastpanel,BorderLayout.EAST);
            Centerpanel.add(Centerup);
            Centerpanel.add(Centerdown);
            //chineshe west panel
            WestPanel.add(Sandwich,BorderLayout.NORTH);
            WestPanel.add(WestCenter,BorderLayout.CENTER);
            WestPanel.setBorder(BorderFactory.createLineBorder(Color.black));
            WestCenter.add(FishSandwich);
            WestCenter.add(Fishnum);
            WestCenter.add(CheeseSandwich);
            WestCenter.add(Cheesenum);
            WestCenter.add(ChickenSandwich);
            WestCenter.add(Chickennum);
            WestCenter.add(MeatSandwich);
            WestCenter.add(Meatnum);
            Fishnum.setBorder(BorderFactory.createTitledBorder("price"));
            Cheesenum.setBorder(BorderFactory.createTitledBorder("price"));
            Chickennum.setBorder(BorderFactory.createTitledBorder("price"));
            Meatnum.setBorder(BorderFactory.createTitledBorder("price"));
            Centerdown.add(btnTotal);
            Centerdown.add(btnReset);
            Centerdown.add(btnExit);
            Eastpanel.add(East);
            btnTotal.addActionListener(e-> Placeorder());
            btnTotal.addActionListener(e-> ordereraser());
            Centerup.add(Drinks);
            Centerup.add(Drinks1);
            Centerup.add(Tea);
            Centerup.add(Teamnum);
            Centerup.add(Soda);
            Centerup.add(Sodanum);
            Centerup.add(Coffee);
            Centerup.add(Coffeenum);
            Centerup.add(Orange);
            Centerup.add(Orangenum);
            Centerup.add(Bottlewater);
            Centerup.add(Bottlewaternum);
            Centerup.setBorder(BorderFactory.createLineBorder(Color.black));
            Teamnum.setBorder(BorderFactory.createTitledBorder("price"));
            Sodanum.setBorder(BorderFactory.createTitledBorder("price"));
            Coffeenum.setBorder(BorderFactory.createTitledBorder("price"));
            Orangenum.setBorder(BorderFactory.createTitledBorder("price"));
            Bottlewaternum.setBorder(BorderFactory.createTitledBorder("price"));


        }

    }
    public void Placeorder(){
        if(FishSandwich.isSelected()){
            orderprice++;
        }
        if(CheeseSandwich.isSelected()){
            orderprice=orderprice+2;
        }
        if(ChickenSandwich.isSelected()){
            orderprice=orderprice+3;
        }
        if(MeatSandwich.isSelected()){
            orderprice=orderprice+4;
        }
        if(Tea.isSelected()){
            orderprice=orderprice+1;
        }
        if(Soda.isSelected()){
            orderprice=orderprice+2;
        }
        if(Coffee.isSelected()){
            orderprice=orderprice+3;
        }
        if(Orange.isSelected()){
            orderprice=orderprice+4;
        }
        if(Bottlewater.isSelected()){
            orderprice=orderprice+5;
        }
        System.out.println(orderprice);
    }
    public void ordereraser(){
        orderprice=0;
    }
}
