package bank.management.s;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.AnnotatedTypeVariable;

public class Signup2 extends JFrame implements ActionListener {

    JButton button;
    JRadioButton radioButton,radioButton2,radioButton3,radioButton4;
    JTextField textField,textField2;

    JComboBox comboBox,comboBox2,comboBoxinc,comboBoxed,comboBoxOQ ;
    String formno;
    Signup2(String formno){
        super("Application From");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(220,10,100,100);
        add(image);
        this.formno  = formno;

        JLabel label1 = new JLabel("Page-: 2");
        label1.setFont(new Font("Raleway",Font.BOLD,20));
        label1.setBounds(340,20,600,70);
        add(label1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setBounds(335,45,400,78);
        l2.setFont(new Font("Raleway",Font.BOLD,30));
        add(l2);

        JLabel l3 = new JLabel("Religion: ");
        l3.setBounds(130,130,200,60);
        l3.setFont(new Font("Raleway",Font.BOLD,23));
        add(l3);

        String religion[] = {"HINDU","SIKH","CHRISTIAN","OTHER"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,72));
        comboBox.setFont(new Font("Raleway",Font.PLAIN,16));
        comboBox.setBounds(500,150,300,23);
        add(comboBox);

        JLabel cat = new JLabel("Category: ");
        cat.setFont(new Font("Raleway",Font.BOLD,23));
        cat.setBounds(130,180,200,60);
        add(cat);

        String Category[] = {"GENERAL","OBC","ST","SC","OTHER"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(252,208,72));
        comboBox2.setFont(new Font("Owen Earl",Font.PLAIN,16));
        comboBox2.setBounds(500,200,300,23);
        add(comboBox2);

        JLabel income = new JLabel("Income: ");
        income.setBounds(130,230,200,60);
        income.setFont(new Font("Raleway",Font.BOLD,23));
        add(income);

        String Income[] = {"Null","<1,50,000","<2,50,000","5,50,000","Upto 10,00,000","Above 10,00,000"};
        comboBoxinc = new JComboBox(Income);
        comboBoxinc.setBackground(new Color(252,208,72));
        comboBoxinc.setFont(new Font("Owen Earl",Font.PLAIN,16));
        comboBoxinc.setBounds(500,250,300,23);
        add(comboBoxinc);

        JLabel Education = new JLabel("Education: ");
        Education.setBounds(130,280,200,60);
        Education.setFont(new Font("Raleway",Font.BOLD,23));
        add(Education);

        String education[] = {"NON-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        comboBoxed = new JComboBox(education);
        comboBoxed.setBackground(new Color(252,208,72));
        comboBoxed.setFont(new Font("Raleway",Font.PLAIN,16));
        comboBoxed.setBounds(500,300,300,23);
        add(comboBoxed);

        JLabel occupation = new JLabel("Occupation: ");
        occupation.setBounds(130,330,200,60);
        occupation.setFont(new Font("Raleway",Font.BOLD,23));
        add(occupation);

        String Occupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBoxOQ = new JComboBox(Occupation);
        comboBoxOQ.setBackground(new Color(252,208,72));
        comboBoxOQ.setFont(new Font("Raleway",Font.PLAIN,16));
        comboBoxOQ.setBounds(500,350,300,23);
        add(comboBoxOQ);

        JLabel Pan = new JLabel("Pan No.: ");
        Pan.setBounds(130,380,200,60);
        Pan.setFont(new Font("Raleway",Font.BOLD,23));
        add(Pan);

        textField = new JTextField("");
        textField.setBounds(500,400,300,23);
        textField.setFont(new Font("Raleway",Font.BOLD,20));
        add(textField);

        JLabel adr  = new JLabel("Adhaar No.: ");
        adr.setBounds(130,430,200,60);
        adr.setFont(new Font("Raleway",Font.BOLD,23));
        add(adr);

        textField2 = new JTextField("");
        textField2.setBounds(500,450,300,23);
        textField2.setFont(new Font("Raleway",Font.BOLD,20));
        add(textField2);

        JLabel sl = new JLabel("Sernior Citizen: ");
        sl.setBounds(130,480,200,60);
        sl.setFont(new Font("Raleway",Font.BOLD,23));
        add(sl);

        radioButton = new JRadioButton("Yes");
        radioButton.setBackground(new Color(252,208,72));
        radioButton.setBounds(495,500,80,20);
        radioButton.setFont(new Font("Raleway",Font.PLAIN,18));
        add(radioButton);

        radioButton2 = new JRadioButton("No");
        radioButton2.setBackground(new Color(252,208,72));
        radioButton2.setBounds(600,500,80,20);
        radioButton2.setFont(new Font("Raleway",Font.PLAIN,18));
        add(radioButton2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton);
        buttonGroup.add(radioButton2);

        JLabel exitacc = new JLabel("Existing Account: ");
        exitacc.setBounds(130,530,400,60);
        exitacc.setFont(new Font("Raleway",Font.BOLD,23));
        add(exitacc);

        radioButton3 = new JRadioButton("Yes");
        radioButton3.setBackground(new Color(252,208,72));
        radioButton3.setBounds(495,550,80,20);
        radioButton3.setFont(new Font("Raleway",Font.PLAIN,18));
        add(radioButton3);

        radioButton4 = new JRadioButton("No");
        radioButton4.setBackground(new Color(252,208,72));
        radioButton4.setBounds(600,550,80,20);
        radioButton4.setFont(new Font("Raleway",Font.PLAIN,18));
        add(radioButton4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton3);
        buttonGroup1.add(radioButton4);

        JLabel form = new JLabel("Form No: ");
        form.setBounds(750,10,100,70);
        form.setFont(new Font("Raleway",Font.BOLD,14));
        add(form);

        JLabel form2 = new JLabel(formno);
        form2.setFont(new Font("Raleway",Font.BOLD,14));
        form2.setBounds(820,7,60,100);
        add(form2);

        button  = new JButton("NEXT");
        button.setFont(new Font("Raleway",Font.PLAIN,14));
        button.setBounds(740,620,80,25);
        button.setBackground(Color.white);
        button.setForeground(Color.black);
        button.addActionListener(this);
        add(button);

        setLayout(null);
        setSize(940,700);
        setLocation(200,30);
        getContentPane().setBackground(new Color(252 ,208,72));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String)  comboBoxinc.getSelectedItem();
        String edu = (String)  comboBoxed.getSelectedItem();
        String occ = (String)  comboBoxOQ.getSelectedItem();

        String pan = textField.getText();
        String Adr = textField2.getText();

        String Scitizen = " ";
        if (radioButton.isSelected()){
            Scitizen = "Yes";
        }else if (radioButton2.isSelected()){
            Scitizen = "No";
        }

        String eAccount = " ";
        if (radioButton.isSelected()){
            eAccount = "Yes";
        }else if (radioButton2.isSelected()){
            eAccount = "No";
        }

        try{
            if(textField.getText().equals("") || textField2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
                else{
                    Connector c1 = new Connector();
                    String q1 = "insert into Signuptwo Values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+Adr+"','"+Scitizen+"','"+eAccount+"')";
                    c1.statement.executeUpdate(q1);
                    new Signup3(formno);
                    setVisible(false);
                }

        }catch (Exception E){
                E.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new Signup2(" ");
    }
}
