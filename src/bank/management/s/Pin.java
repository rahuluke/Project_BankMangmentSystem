package bank.management.s;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame  implements ActionListener{
    JButton b1,b2;
    JPasswordField p1, p2;
    String pin;
    Pin(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(-50,0,1500,700);
        add(l3);

        JLabel lable1 = new JLabel("Chang Your Pin -:");
        lable1.setForeground(Color.white);
        lable1.setFont(new Font("Raleway",Font.BOLD,20));
        lable1.setBounds(420,160,400,35);
        l3.add(lable1);

        JLabel lable2 = new JLabel("New PIN :");
        lable2.setForeground(Color.white);
        lable2.setFont(new Font("Raleway",Font.BOLD,16));
        lable2.setBounds(420,205,400,35);
        l3.add(lable2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.white);
        p1.setBounds(600,210,200,25);
        p1.setFont(new Font("Raleway",Font.BOLD,16));
        l3.add(p1);

        JLabel lable3 = new JLabel("Re-Enter New PIN:");
        lable3.setForeground(Color.white);
        lable3.setFont(new Font("Raleway",Font.BOLD,16));
        lable3.setBounds(420,240,400,35);
        l3.add(lable3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.white);
        p2.setBounds(600,250,200,25);
        p2.setFont(new Font("Raleway",Font.BOLD,16));
        l3.add(p2);

        b1 = new JButton("CHANGE");
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
            try{

                    String pin1 = p1.getText();
                    String pin2 = p2.getText();

                    if(!pin1.equals(pin2)){
                        JOptionPane.showMessageDialog(null,"Enter PIN does not match");
                        return;
                    }
                    if(e.getSource()==b1) {
                        if(p1.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Enter New PIN");
                            return;
                        }
                        if(p2.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Re-Enter New PIN ");
                            return;
                        }

                        Connector c1 = new Connector();
                        String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                        String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                        String q3 = "update Singupthree set pin = '"+pin1+"' where pin = '"+pin+"'";

                        c1.statement.executeUpdate(q1);
                        c1.statement.executeUpdate(q2);
                        c1.statement.executeUpdate(q3);

                        JOptionPane.showMessageDialog(null,"PIN changed Successfully");
                        setVisible(false);
                        new main_Class(pin);

                    } else if(e.getSource()==b2){
                        new main_Class(pin);
                        setVisible(false);
                    }

            }catch (Exception E){
                    E.printStackTrace();
            }
    }

    public static void main(String[] args) {
        new Pin("");
    }
}
