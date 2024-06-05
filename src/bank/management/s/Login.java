package bank.management.s;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel lable1,lable2,lable3;
    JTextField textField2;
    JPasswordField PasswordField3;

    JButton button1,button2,button3;
    Login(){
        super("Bank Managment System");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10 ,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350 ,100,100);
        add(iimage);

        lable1 = new JLabel("WELCOME TO ATM");
        lable1.setForeground(Color.WHITE);
        lable1.setFont(new Font("AvantGarde",Font.BOLD,35));
        lable1.setBounds(230,135,450,40);
        add(lable1);

        lable2 = new JLabel("CARD NO:");
        lable2.setForeground(Color.white);
        lable2.setFont(new Font("Ralway",Font.BOLD,28));
        lable2.setBounds(150,200,375,30);
        add(lable2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,200,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        lable3 = new JLabel("PIN: ");
        lable3.setForeground(Color.white);
        lable3.setFont(new Font("Ralway",Font.BOLD,28));
        lable3.setBounds(150,250,375,30);
        add(lable3);

        PasswordField3 = new JPasswordField(15);
        PasswordField3.setBounds(325,250,230,30);
        PasswordField3.setFont((new Font("Arial",Font.BOLD,28)));
        add(PasswordField3);

////////////////////////////////////-----BUTTONS-----////////////////////////////////////////////////////
        button1 = new JButton("SIGN-IN");
        button1.setFont(new Font("Gabarito",Font.PLAIN,13));
        button1.setForeground(Color.BLACK);
        //button1.setBackground(Color.BLACK);
        button1.setBounds(300,310,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Gabarito",Font.PLAIN,13));
        button2.setForeground(Color.BLACK);
        button2.setBounds(430,310,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN-UP");
        button3.setFont(new Font("Gabarito",Font.PLAIN,13));
        button3.setForeground(Color.BLACK);
        button3.setBounds(320,370,200,30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

        setLayout(null);
        setSize(850,480);
        setLocation(250,200);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
                if(e.getSource() == button1){
                    Connector c1 = new Connector();
                    String cardno = textField2.getText();
                    String pin = PasswordField3.getText();
                    String q = "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
                    ResultSet resultSet = c1.statement.executeQuery(q);
                    if(resultSet.next()){
                            setVisible(false);
                            new main_Class(pin);
                    }else {
                        JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                    }
                } else if (e.getSource() == button2) {
                    textField2.setText("");
                    PasswordField3.setText("");
                    
                } else if (e.getSource() == button3) {
                        new signup();
                        setVisible(false);
                }

        }catch (Exception E){
                E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }



}
