package bank.management.s;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Optional;

public class Withdraw extends JFrame implements ActionListener {

    JButton b1,b2;
    JTextField textField1;
    String pin;
     Withdraw(String pin){
         this.pin = pin;
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
         Image i2 = i1.getImage().getScaledInstance(1500,700, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel l3 = new JLabel(i3);
         l3.setBounds(-50,0,1500,700);
         add(l3);

         JLabel l11 = new JLabel("Maximum Withdraw is Rs.10,000");
         l11.setForeground(Color.white);
         l11.setFont(new Font("Raleway",Font.BOLD,18));
         l11.setBounds(470,130,400,35);
         l3.add(l11);

         JLabel l1 = new JLabel("Please Enter Your Amount ");
         l1.setForeground(Color.white);
         l1.setFont(new Font("Raleway",Font.PLAIN,17));
         l1.setBounds(470,160,400,35);
         l3.add(l1);

         textField1 = new JTextField("");
         textField1.setBackground(new Color(65,125,128));
         textField1.setForeground(Color.white);
         textField1.setBounds(410,200,400,25);
         textField1.setFont(new Font("Raleway",Font.BOLD,22));
         l3.add(textField1);

         b1 = new JButton("WITHDRAW");
         b1.setBounds(670,305,150,30);
         b1.setBackground(new Color(65,125,128));
         b1.setForeground(Color.white);
         b1.addActionListener(this);
         l3.add(b1);



         b2 = new JButton("BACK");
         b2.setBounds(670,347,150,30);
         b2.setBackground(new Color(65,125,128));
         b2.setForeground(Color.white);
         b2.addActionListener(this);
         l3.add(b2);


         setLayout(null);
         setSize(1550,1080);
         setLocation(0,0);
         setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            try {
                String amount = textField1.getText();
                Date date = new Date();
                if (textField1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter The Amount You Want To Withdraw");
                } else {
                    Connector c1 = new Connector();
                    ResultSet resultSet = c1.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposite")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c1.statement.executeUpdate("insert into bank values('"+pin+"','" + date + "','withdrawl','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs."+ amount +" Debited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }

            } catch (Exception E) {

            }
        }else if (e.getSource()==b2){
            setVisible(false);
            new main_Class(pin);
        }
    }

    public static void main(String[] args) {
            new Withdraw("");
    }
}
