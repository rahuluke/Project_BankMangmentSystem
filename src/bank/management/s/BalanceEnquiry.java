package bank.management.s;

import javax.naming.directory.BasicAttribute;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

            String pin;
            JButton b1;
            JLabel label2;
            BalanceEnquiry(String pin){

                this.pin = pin;

                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
                Image i2 = i1.getImage().getScaledInstance(1500,700, Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel l3 = new JLabel(i3);
                l3.setBounds(-50,0,1500,700);
                add(l3);

                JLabel l1 = new JLabel("Your Current Account Balance is Rs.");
                l1.setForeground(Color.white);
                l1.setFont(new Font("Raleway",Font.BOLD,18));
                l1.setBounds(420,150,400,35);
                l3.add(l1);


                label2 = new JLabel();
                label2.setForeground(Color.white);
                label2.setFont(new Font("System",Font.BOLD,18));
                label2.setBounds(430,200,400,35);
                l3.add(label2);

                b1 = new JButton("BACK");
                b1.setBounds(670,347,150,30);
                b1.setBackground(new Color(65,125,128));
                b1.setForeground(Color.white);
                b1.addActionListener(this);
                l3.add(b1);

                int balance = 0;

                try{
                    Connector c1  = new Connector();
                    ResultSet resultSet = c1.statement.executeQuery("Select * from bank where pin ='"+pin+"'");
                    while (resultSet.next()){
                        if(resultSet.getString("type").equals("Deposit")){
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        }else{
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();

                }
                label2.setText(""+balance);

                setLayout(null);
                setSize(1550,1080);
                setLocation(0,0);
                setVisible(true);

            }

    @Override
    public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new main_Class(pin);

    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
