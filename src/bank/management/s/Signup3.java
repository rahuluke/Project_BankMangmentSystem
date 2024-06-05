package bank.management.s;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JButton s1 , s2;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    String  formno;

    Signup3(String formno){
        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(220,10,100,100);
        add(image);

        JLabel l1 = new JLabel("Page-: 3");
        l1.setFont(new Font("Raleway",Font.BOLD,23));
        l1.setBounds(355,30,600,70);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD, 30));
        l2.setBounds(355,45,400,100);
        add(l2);

        JLabel l3 = new JLabel("Account Type: ");
        l3.setFont(new Font("Raleway",Font.BOLD, 18));
        l3.setBounds(130,130,200,60);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.PLAIN,18));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(140,177,200,30);
        add(r1);

        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway",Font.PLAIN,18));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(140,220,200,30);
        add(r2);

        r3 = new JRadioButton("Fixed Deposit Account");
        r3.setFont(new Font("Raleway",Font.PLAIN,18));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(450,177,300,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.PLAIN,18));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(450,220,300,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number: ");
        l4.setFont(new Font("Raleway",Font.BOLD, 18));
        l4.setBounds(130,250,200,60);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-Digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD, 12));
        l5.setBounds(130,290,200,20);
        add(l5);

        JLabel l6 = new JLabel("(XXXX-XXXX-XXXX-5292)");
        l6.setFont(new Font("Raleway",Font.BOLD, 18));
        l6.setBounds(450,250,300,60);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on ATM Card/Cheque Book and Statments)");
        l7.setFont(new Font("Raleway",Font.BOLD, 12));
        l7.setBounds(450,290,500,20);
        add(l7);

        JLabel l8 = new JLabel("PIN: ");
        l8.setFont(new Font("Raleway",Font.BOLD, 18));
        l8.setBounds(130,340,200,20);
        add(l8);

        JLabel l9 = new JLabel("(4-digit Password)");
        l9.setFont(new Font("Raleway",Font.BOLD, 12));
        l9.setBounds(130,360,200,20);
        add(l9);

        JLabel l10= new JLabel("XXXX");
        l10.setFont(new Font("Raleway",Font.BOLD, 18));
        l10.setBounds(450,340,200,20);
        add(l10);

        JLabel l11 = new JLabel("Service Provided:");
        l11.setFont(new Font("Raleway",Font.BOLD, 18));
        l11.setBounds(130,410,200,20);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,15));
        c1.setBounds(130,450,170,30);
        c1.setBackground(new Color(215,252,252));
        add(c1);

        c2 = new JCheckBox("Mobile Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,15));
        c2.setBounds(130,480,200,30);
        c2.setBackground(new Color(215,252,252));
        add(c2);

        c3 = new JCheckBox("Cheuqe Book");
        c3.setFont(new Font("Raleway",Font.BOLD,15));
        c3.setBounds(130,510,180,30);
        c3.setBackground(new Color(215,252,252));
        add(c3);

        c4 = new JCheckBox("E-Statement");
        c4.setFont(new Font("Raleway",Font.BOLD,15));
        c4.setBounds(400,510,170,30);
        c4.setBackground(new Color(215,252,252));
        add(c4);

        c5 = new JCheckBox("Internet Banking");
        c5.setFont(new Font("Raleway",Font.BOLD,15));
        c5.setBounds(400,450,170,30);
        c5.setBackground(new Color(215,252,252));
        add(c5);

        c6 = new JCheckBox("Mobile Banking");
        c6.setFont(new Font("Raleway",Font.BOLD,15));
        c6.setBounds(400,480,200,30);
        c6.setBackground(new Color(215,252,252));
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declare that the above entered details correct to the best of my Knlowldege",true);
        c7.setFont(new Font("Raleway",Font.PLAIN,12));
        c7.setBounds(130,560,700,30);
        c7.setBackground(new Color(215,252,252));
        add(c7);

        JLabel form = new JLabel("Form No: ");
        form.setBounds(700,10,100,100);
        form.setFont(new Font("Raleway",Font.BOLD,14 ));
        add(form);

        JLabel form2 = new JLabel(formno);
        form2.setFont(new Font("Raleway",Font.BOLD,14));
        form2.setBounds(770,10,60,100);
        add(form2);

        s1 = new JButton("Submit");
        s1.setBackground(Color.black);
        s1.setForeground(Color.white);
        s1.setBounds(300,600,80,30);
        s1.setFont(new Font("Raleway",Font.BOLD,12));
        s1.addActionListener(this);
        add(s1);

        s2 = new JButton("Cancel");
        s2.setBackground(Color.black);
        s2.setForeground(Color.white);
        s2.setBounds(530,600,80,30);
        s2.setFont(new Font("Raleway",Font.BOLD,12));
        s2.addActionListener(this);
        add(s2);

        setLayout(null);
        setSize(940,700);
        setLocation(200,30);
        getContentPane().setBackground(new Color( 215,252,252));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String atype = null;
            if(r1.isSelected()){
                atype = "Saving Account";
            }else if (r2.isSelected()){
                atype = "Current Account";
            }else if (r3.isSelected()){
                atype = "Fixed Deposit Account";
            }else if (r4.isSelected()){
                atype = "Recurring Deposit Account";
            }

            Random ran = new Random();
            long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
            String cardno = " " + Math.abs(first7);

            long first3 = (ran.nextLong() % 9000L) + 1000L;
            String pin = " " + Math.abs(first3);


            String fac = "";
            if(c1.isSelected()){
                fac = "ATM CARD";
            } else if (c2.isSelected()) {
                fac = "Mobile Banking";
            } else if (c3.isSelected()){
                fac = "Cheuqe Book";
            } else if (c4.isSelected()){
                fac = "E-Statement";
            } else if (c5.isSelected()){
                fac = "Internet Banking";
            } else if(c6.isSelected()){
                fac = "Mobile Banking";
            }

            try {
                if(e.getSource()==s1){
                    if (atype == null){
                         JOptionPane.showMessageDialog(null,"Fill all the Fields ");
                    }else {
                        Connector c1 = new Connector();
                        String q1 = "insert into Singupthree Values('" + formno + "','" + atype + "','" + cardno + "','" + pin + "','" + fac + "')";
                        String q2 = "insert into login Values('" + formno + "','" + cardno + "','" + pin + "')";
                        c1.statement.executeUpdate(q1);
                        c1.statement.executeUpdate(q2);
                        JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin: " + pin);
                        new Deposite(pin);
                        setVisible(false);
                    }
                } else if (e.getSource()==s2) {
                    System.exit(0);
                    
                }
            }catch (Exception E){
                E.printStackTrace();

            }
    }

    public static void main(String[] args) {

        new Signup3("");
    }
}
