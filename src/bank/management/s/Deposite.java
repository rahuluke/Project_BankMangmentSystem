package bank.management.s;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class Deposite extends JFrame  implements ActionListener {

        JButton b1,b2;
        JTextField textField1;
        String pin;
        Deposite(String pin){
            this.pin = pin;

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
            Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel l3 = new JLabel(i3);
            l3.setBounds(1,0,1550,830);
            add(l3);

            JLabel l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
            l1.setForeground(Color.white);
            l1.setFont(new Font("Raleway",Font.BOLD,18));
            l1.setBounds(445,180,400,35);
            l3.add(l1);

            textField1 = new JTextField("");
            textField1.setBackground(new Color(65,125,128));
            textField1.setForeground(Color.white);
            textField1.setBounds(430,220,400,25);
            textField1.setFont(new Font("Raleway",Font.BOLD,22));
            l3.add(textField1);

            b1 = new JButton("DEPOSITE");
            b1.setBounds(700,366,150,35);
            b1.setBackground(new Color(65,125,128));
            b1.setForeground(Color.white);
            l3.add(b1);
            b1.addActionListener(this);


            b2 = new JButton("BACK");
            b2.setBounds(700,412,150,35);
            b2.setBackground(new Color(65,125,128));
            b2.setForeground(Color.white);
            l3.add(b2);
            b2.addActionListener(this);

            setLayout(null);
            setSize(1550,1080);
            setLocation(0,0);
            setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
            try{
            String amount = textField1.getText();
            Date date = new Date();
            if(e.getSource()==b1){
                if(textField1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
                }else{
                    Connector c1 = new Connector();
                    c1.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new main_Class(pin);

                }
            }else if(e.getSource()==b2){
                setVisible(false);
                new main_Class(pin);

              }
            }catch (Exception E){
                    E.printStackTrace();
            }
    }

    public static void main(String[] args) {
            new Deposite("");
    }
}
