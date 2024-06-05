package bank.management.s;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {
        JRadioButton r1,r2;
        JButton next;
        JTextField textname ,textnameA ,textnameEA,textnamecity,textnamestate,textnamePin;

        JDateChooser dateChooser;
        Random ran = new Random();
        long firts4 =(ran.nextLong() % 9000L) * 1000L;
        String firts =" " + Math.abs(firts4);
        signup(){
            super("Application From");

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
            Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(25,10 ,100,100);
            add(image);

            JLabel label1 = new JLabel("APPLICATION FROM NO. "+firts4);
            label1.setBounds(160,20,630,40);
            label1.setFont(new Font("Raleway",Font.BOLD,38));
            add(label1);

            JLabel label2 = new JLabel("Page 1");
            label2.setFont(new Font("Raleway",Font.BOLD,22));
            label2.setBounds(330,70,600,30);
            add(label2);

            JLabel label3 =new JLabel("Personal Details");
            label3.setFont(new Font("Raleway",Font.BOLD,22));
            label3.setBounds(290,100,600,30);
            add(label3);

            JLabel labelname = new JLabel("Name :");
            labelname.setFont(new Font("Raleway",Font.BOLD,20));
            labelname.setBounds(100,190,100,30);
            add(labelname);

            textname = new JTextField();
            textname.setFont(new Font("Arial",Font.BOLD,14));
            textname.setBounds(250,195,400,25);
            add(textname);

            JLabel dob = new JLabel("Date of Birth :");
            dob.setFont(new Font("Raleway",Font.BOLD,20));
            dob.setBounds(100,240,200,30);
            add(dob);

            dateChooser = new JDateChooser();
            dateChooser.setForeground(new Color(105,105,105 ));
            dateChooser.setBounds(250,240,400,25);
            add(dateChooser);

            JLabel labelG = new JLabel("Gender :");
            labelG.setFont(new Font("Raleway",Font.BOLD,20));
            labelG.setBounds(100,290,100,30);
            add(labelG);

            r1 = new JRadioButton("Male");
            r1.setFont(new Font("Raleway",Font.BOLD,14));
            r1.setBackground(new Color(222,255,220));
            r1.setBounds(250,290,60,30);
            add(r1);

            r2 = new JRadioButton("Female");
            r2.setFont(new Font("Raleway",Font.BOLD,14));
            r2.setBackground(new Color(222,255,220));
            r2.setBounds(370,290,80,30);
            add(r2);

            ButtonGroup buttonGP = new ButtonGroup();
            buttonGP.add(r1);
            buttonGP.add(r2);

            JLabel labelEADD = new JLabel("Email Address :");
            labelEADD.setFont(new Font("Raleway",Font.BOLD,20));
            labelEADD.setBounds(100,340,200,30);
            add(labelEADD);

            textnameEA= new JTextField();
            textnameEA.setFont(new Font("Arial",Font.BOLD,14));
            textnameEA.setBounds(250,345,400,25);
            add(textnameEA);

            JLabel labelADD = new JLabel("Address :");
            labelADD.setFont(new Font("Raleway",Font.BOLD,20));
            labelADD.setBounds(100,390,200,30);
            add(labelADD);

            textnameA= new JTextField();
            textnameA.setFont(new Font("Arial",Font.BOLD,14));
            textnameA.setBounds(250,390,400,25);
            add(textnameA);


            JLabel labelcity = new JLabel("City :");
            labelcity.setFont(new Font("Raleway",Font.BOLD,20));
            labelcity.setBounds(100,440,200,30);
            add(labelcity);

            textnamecity= new JTextField();
            textnamecity.setFont(new Font("Arial",Font.BOLD,14));
            textnamecity.setBounds(250,442,400,25);
            add(textnamecity);

            JLabel labelstate = new JLabel("State :");
            labelstate.setFont(new Font("Raleway",Font.BOLD,20));
            labelstate.setBounds(100,490,200,30);
            add(labelstate);

            textnamestate= new JTextField();
            textnamestate.setFont(new Font("Arial",Font.BOLD,14));
            textnamestate.setBounds(250,487,400,25);
            add(textnamestate);

            JLabel labelPin = new JLabel("Pin Code :");
            labelPin.setFont(new Font("Raleway",Font.BOLD,20));
            labelPin.setBounds(100,540,200,30);
            add(labelPin);

            textnamePin= new JTextField();
            textnamePin.setFont(new Font("Arial",Font.BOLD,14));
            textnamePin.setBounds(250,540,400,25);
            add(textnamePin);

            next = new JButton("Next");
            next.setFont(new Font("Ralway",Font.BOLD,14));
            next.setBackground(Color.BLACK);
            next.setForeground(Color.white);
            next.setBounds(650,610,80,30);
            next.addActionListener(this);
            add(next);

            setLayout(null);
            setSize(830,700);
            setLocation(200,30);
            getContentPane().setBackground(new Color(222,255,228));
            setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent e) {
            String formno = firts;
            String name = textname.getText();
            String dob =((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String gender =null;
            if(r1.isSelected()){
                gender = "Male";
            } else if (r2.isSelected()){
                gender ="Female";
            }
        String email = textnameEA.getText();
            String address = textnameA.getText();
            String city = textnamecity.getText();
            String pin = textnamePin.getText();
            String state = textnamestate.getText();

            try{
                if(textname.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "FIll all the Fields");
                }
                    else{
                            Connector  c1 = new Connector();
                            String q1 = "insert into Signup Values('"+formno+"','"+name+"','"+dob+"','"+gender+"','"+email+"','"+address +"','"+city+"','"+pin+"','"+state+"')";
                            c1.statement.executeUpdate(q1);
                            new Signup2(formno);
                            setVisible(false);
                    }
            }catch (Exception E){
                E.printStackTrace();
            }


        }

    public static void main(String[] args) {
                new signup();
    }
}
