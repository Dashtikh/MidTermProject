package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShoppingPage {
    int orderprice=0;
    String order;
    String allorder="";
    JFrame frame = new JFrame("Restaurant Management");
    Icon icon = new ImageIcon("D:\\adv pro\\Learning Swing\\MidTermProject\\src\\com\\company\\bg.jpg");
    JLabel Background = new JLabel(icon, JLabel.CENTER);
    //JLabel East = new JLabel("east", JLabel.CENTER);

    JPanel MainPanel = new JPanel(new BorderLayout(8,8));
    JLabel Restaurant = new JLabel("Restaurant", JLabel.CENTER);
    JPanel WestPanel = new JPanel(new BorderLayout());
    JPanel Centerpanel = new JPanel(new GridLayout(2,1));
    JPanel Centerup = new JPanel(new GridLayout(6,2));
    JPanel Centerdown = new JPanel(new GridLayout(1,3));
    JLabel Sandwich = new JLabel("Sandwich",JLabel.CENTER);
    JPanel WestCenter = new JPanel(new GridLayout(4,2));
    JPanel Eastpanel = new JPanel(new GridLayout(11,1));
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
    JLabel Payment = new JLabel("Payment Checkout !",JLabel.CENTER);
    JLabel lChicken = new JLabel("",JLabel.CENTER);
    JLabel lFish = new JLabel("",JLabel.CENTER);
    JLabel lMeat = new JLabel("",JLabel.CENTER);
    JLabel lCheese = new JLabel("",JLabel.CENTER);
    JLabel lTea = new JLabel("",JLabel.CENTER);
    JLabel lCoffee = new JLabel("",JLabel.CENTER);
    JLabel lSoda = new JLabel("",JLabel.CENTER);
    JLabel lOrange = new JLabel("",JLabel.CENTER);
    JLabel lBottle = new JLabel("",JLabel.CENTER);
    JLabel lTotal = new JLabel("Total : ",JLabel.CENTER);

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
            btnTotal.addActionListener(e-> Placeorder());
            btnTotal.addActionListener(e-> ordereraser());
            btnReset.addActionListener(e-> unchecker());
            btnExit.addActionListener(e-> sysexit());
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
            Eastpanel.setBorder(BorderFactory.createLineBorder(Color.black));
            Payment.setFont(new Font("aa",Font.PLAIN,40));
            Eastpanel.add(Payment);
            Eastpanel.add(lFish);
            Eastpanel.add(lBottle);
            Eastpanel.add(lCheese);
            Eastpanel.add(lChicken);
            Eastpanel.add(lCoffee);
            Eastpanel.add(lMeat);
            Eastpanel.add(lOrange);
            Eastpanel.add(lSoda);
            Eastpanel.add(lTea);
            Eastpanel.add(lTotal);






        }

    }
    public void Placeorder(){
        if(FishSandwich.isSelected()){
            orderprice++;
            lFish.setText("Fish sandwich................1$");
            allorder=allorder+"  Fish sandwich 1$  ";

        }
        if(CheeseSandwich.isSelected()){
            lCheese.setText("Cheese sandwich................2$");
            allorder=allorder+"  Cheese sandwich 2$  ";
            orderprice=orderprice+2;
        }
        if(ChickenSandwich.isSelected()){
            lChicken.setText("Chicken sandwich................3$");
            allorder=allorder+"  Chicken sandwich 3$  ";
            orderprice=orderprice+3;
        }
        if(MeatSandwich.isSelected()){
            lMeat.setText("Meat sandwich................4$");
            allorder=allorder+"  Meat sandwich 4$  ";
            orderprice=orderprice+4;
        }
        if(Tea.isSelected()){
            lTea.setText("Tea ................1$");
            allorder=allorder+"  Tea 1$  ";
            orderprice=orderprice+1;
        }
        if(Soda.isSelected()){
            lSoda.setText("Soda ................2$");
            allorder=allorder+"  Soda 2$  ";
            orderprice=orderprice+2;
        }
        if(Coffee.isSelected()){
            lCoffee.setText("Coffee ................3$");
            allorder=allorder+"  Coffee 3  $";
            orderprice=orderprice+3;
        }
        if(Orange.isSelected()){
            lOrange.setText("Orange ................4$");
            allorder=allorder+"  Orange 4$  ";
            orderprice=orderprice+4;
        }
        if(Bottlewater.isSelected()){
            lBottle.setText("Water................5$");
            allorder=allorder+"  Water 5$  ";
            orderprice=orderprice+5;
        }
        lTotal.setText("Total : "+orderprice);
        order=String.valueOf(orderprice);
        allorder=allorder+"  total is "+orderprice;
        try {
            DataBaseLogger();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        // System.out.println(orderprice);
      System.out.println(allorder);
    }
    public void ordereraser(){

        orderprice=0;
    }
    public void unchecker(){
        ChickenSandwich.setSelected(false);
        MeatSandwich.setSelected(false);
        FishSandwich.setSelected(false);
        CheeseSandwich.setSelected(false);
        Tea.setSelected(false);
        Soda.setSelected(false);
        Coffee.setSelected(false);
        Bottlewater.setSelected(false);
        Orange.setSelected(false);
        lBottle.setText("");
        lOrange.setText("");
        lCoffee.setText("");
        lSoda.setText("");
        lTea.setText("");
        lMeat.setText("");
        lChicken.setText("");
        lCheese.setText("");
        lFish.setText("");
        orderprice=0;
        lTotal.setText("Total : "+orderprice);
        allorder=null;








    }
    public void sysexit(){
        System.exit(0);
    }
    public String fishekharid(){
        return allorder;


    }
    public void DataBaseLogger() throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection =
                DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Dashtikh","dashti1565");
        PreparedStatement preparedStatement =
                connection.prepareStatement("insert into allorder (Fish) values (?)");
        preparedStatement.setString(1, allorder);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();

    }
}
