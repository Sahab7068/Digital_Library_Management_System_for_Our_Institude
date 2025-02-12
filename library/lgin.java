package library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;

public class lgin extends JFrame implements ActionListener {
    JTextField userfiled,passwordfiled;
    JButton button,button1;
    lgin(){

        JPanel panel = new JPanel();
        panel.setBounds(0,0,1100,770);
        panel.setLayout(null);
        panel.setBackground(Color.yellow);
        add(panel);

        JLabel cancelButton = new JLabel("X");
        cancelButton.setBounds(1070,-8,60,60);
        cancelButton.setForeground(Color.RED);
        cancelButton.setFont(new Font("Tahoma",Font.BOLD,30));
        panel.add(cancelButton);
        cancelButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(JFrame.EXIT_ON_CLOSE);

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon imageIcon3 =new ImageIcon(ClassLoader.getSystemResource("liicon/switch.png"));
        Image image1 = imageIcon3.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(image1);
        JLabel labeln = new JLabel(imageIcon2);
        labeln.setBounds(1000,7,30,30);
        labeln.setLayout(null);
        panel.add(labeln);

        labeln.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               new Loginpage();
               setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });



        JLabel loginlabel = new JLabel("Signup With Email");
        loginlabel.setBounds(420,180,300,35);
        loginlabel.setForeground(Color.GRAY);
        loginlabel.setFont(new Font("Tahoma",Font.BOLD,30));
        panel.add(loginlabel);

        JLabel label2 = new JLabel("Without Login Not Access Admin Panel");
        label2.setBounds(420,230,300,35);
        label2.setForeground(Color.GRAY);
        label2.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(label2);



        ImageIcon imageIcon =new ImageIcon(ClassLoader.getSystemResource("liicon/Contact1.png"));
        Image image = imageIcon.getImage().getScaledInstance(1100,670,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0,0,1100,670);
        label.setLayout(null);
        panel.add(label);

        userfiled = new JTextField();
        userfiled.setBounds(435,295,230,30);
//        userfiled.setBackground(Color.cyan);
        userfiled.setForeground(Color.BLACK);
//        userfiled.setOpaque(false);
        userfiled.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(userfiled);


        passwordfiled = new JPasswordField();
        passwordfiled.setBounds(435,380,230,30);
//        userfiled.setBackground(Color.cyan);
        passwordfiled.setForeground(Color.BLACK);
//       passwordfiled.setOpaque(false);
        passwordfiled.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(passwordfiled);

         button = new JButton( "Login");
        button.setBounds(415,470,100,40);
        button.setFont(new Font("Tahoma",Font.BOLD,18));
        button.setForeground(Color.white);
        button.setBackground(new Color(2));
//        button.setBorderPainted(false);
//        button.setBackground(null);
        button.addActionListener( this);
        panel.add(button);

         button1 = new JButton( "New Student");
        button1.setBounds(550,470,170,40);
        button1.setFont(new Font("Tahoma",Font.BOLD,15));
        button1.setForeground(Color.white);
        button1.setBackground(new Color(2));
//        button.setBorderPainted(false);
//        button.setBackground(null);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Sift();
                setVisible(false);
            }
        });
        panel.add(button1);




        setSize(1100,670);
        setLocation(180,15);
        setUndecorated(true);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
if (e.getSource()==button){
    try {
        sqlconn  c = new sqlconn();
        String user = userfiled.getText();
        String pass = passwordfiled.getText();

        String q = "select * from Loginpan where user = '"+user+"'and pass = '"+pass+"'";
        ResultSet resultSet =c.statement.executeQuery(q);
        if (resultSet.next()){
            JOptionPane.showMessageDialog(null,"Login Success");

            new AdminFrame();
            setDefaultCloseOperation(lgin.EXIT_ON_CLOSE);

setVisible(false);

        }else {
            JOptionPane.showMessageDialog(null,"Invalid Credential");

        }
    }catch (Exception e1){
        e1.printStackTrace();
    }
}else {


}
    }


    public static void main(String[] args) {
        new lgin();

//        l.actionPerformed(ActionEvent );
    }
}
