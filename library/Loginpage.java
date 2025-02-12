package library;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import static library.TwoPanelsWithGradients.createGradientPanel;


public class Loginpage extends JFrame implements ActionListener {
        JTextField userfiled;
        JPasswordField passwordfiled;

        JButton b1 ,b2;

    Loginpage(){
        JPanel panel = new JPanel();
        panel.setBounds(0,3,750,700);
        panel.setBackground(Color.white);
        panel.setLayout(null);
        add(panel);

        JLabel titlelabel = new JLabel("GURU SKM ");
        titlelabel.setBounds(3,2,100,30);
        titlelabel.setForeground(Color.RED);
        titlelabel.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(titlelabel);

        JLabel titlelabel1 = new JLabel("Developer");
        titlelabel1.setBounds(90,2,150,30);
        titlelabel1.setForeground(new Color(182, 25, 161, 200));
        titlelabel1.setFont(new Font("Tahoma",Font.BOLD,25));
        panel.add(titlelabel1);

        JLabel welcom = new JLabel("Welcome To ");
        welcom.setBounds(250,80,150,30);
        welcom.setForeground(Color.red);
        welcom.setFont(new Font("Tahoma",Font.PLAIN,22));
        panel.add(welcom);

        JLabel welcom1 = new JLabel("GURU SKM READING POINT");
        welcom1.setBounds(130,120,400,30);
        welcom1.setForeground(new Color(162, 11, 227));
        welcom1.setFont(new Font("Tahoma",Font.BOLD,28));
        panel.add(welcom1);

        ImageIcon imageIcon =new ImageIcon(ClassLoader.getSystemResource("icon/skm1.png"));
        Image image1 = imageIcon.getImage().getScaledInstance(750,500,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image1);
        JLabel imagelabel = new JLabel(imageIcon1);
        imagelabel.setBounds(5,160,750,500);
        panel.add(imagelabel);


        JPanel panel2 = createGradientPanel(Color.CYAN, Color.MAGENTA);
        panel2.setBounds(750,0,450,700);
        panel2.setLayout(null);
        add(panel2);





        JLabel minimize = new JLabel("-");
        minimize.setBounds(350,-8,60,60);
        minimize.setForeground(Color.white);
        minimize.setFont(new Font("Tahoma",Font.BOLD,35));
        panel2.add(minimize);
        minimize.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setState(JFrame.ICONIFIED);
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
        Image image0 = imageIcon3.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon imageIcon5 = new ImageIcon(image0);
        JLabel labeln = new JLabel(imageIcon5);
        labeln.setBounds(300,7,30,30);
        labeln.setLayout(null);
        panel2.add(labeln);

        labeln.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new lgin();
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

        JLabel cancelButton = new JLabel("X");
        cancelButton.setBounds(400,-8,60,60);
        cancelButton.setForeground(Color.white);
        cancelButton.setFont(new Font("Tahoma",Font.BOLD,30));
        panel2.add(cancelButton);
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

        JLabel loginlabel = new JLabel("Login Admin Panel");
        loginlabel.setBounds(100,120,300,35);
        loginlabel.setForeground(Color.WHITE);
        loginlabel.setFont(new Font("Tahoma",Font.BOLD,30));
        panel2.add(loginlabel);

        JLabel skmtitle = new JLabel("     GURU SKM");
        skmtitle.setBounds(100,40,300,35);
        skmtitle.setForeground(Color.WHITE);
        skmtitle.setFont(new Font("Tahoma",Font.BOLD,30));
        panel2.add(skmtitle);

        JLabel userlabel = new JLabel("Username");
        userlabel.setBounds(130,200,150,35);
        userlabel.setForeground(Color.WHITE);
        userlabel.setFont(new Font("Tahoma",Font.BOLD,20));
        panel2.add(userlabel);

        userfiled = new JTextField();
        userfiled.setBounds(130,250,230,30);
//        userfiled.setBackground(Color.cyan);
        userfiled.setForeground(Color.BLACK);
        userfiled.setOpaque(false);
        userfiled.setFont(new Font("Tahoma",Font.BOLD,13));
        panel2.add(userfiled);

        userfiled.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (userfiled.getText().equals(" Enter User ID")) {
                    userfiled.setText("");
                    userfiled.setForeground(Color.BLACK); // Text color on focus
                }
            }

            public void focusLost(FocusEvent e) {
                if (userfiled.getText().isEmpty()) {
                    userfiled.setForeground(Color.BLACK);
                    userfiled.setText(" Enter User ID"); // Reset placeholder text
                }
            }
        });


        JLabel passlabel = new JLabel("Password");
        passlabel.setBounds(130,300,150,35);

        passlabel.setForeground(Color.WHITE);
        passlabel.setFont(new Font("Tahoma",Font.BOLD,20));
        panel2.add(passlabel);

        passwordfiled = new JPasswordField();
        passwordfiled.setBounds(130,350,230,30);
//        userfiled.setBackground(Color.cyan);
        passwordfiled.setForeground(Color.BLACK);
        passwordfiled.setOpaque(false);
        passwordfiled.setFont(new Font("Tahoma",Font.BOLD,13));
        panel2.add(passwordfiled);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/usericon2.png"));
        Image image = imageIcon2.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon imageIcon4 = new ImageIcon(image);
        JLabel userimage = new JLabel(imageIcon4);
        userimage.setBounds(40,240,50,50);
        panel2.add(userimage);


        ImageIcon imageIcon7 = new ImageIcon(ClassLoader.getSystemResource("icon/passicon2.png"));
        Image image2 = imageIcon7.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon imageIcon8 = new ImageIcon(image2);
        JLabel passwordicon = new JLabel(imageIcon8);
        passwordicon.setBounds(40,340,50,50);
        panel2.add(passwordicon);

        b1 = new JButton("Signup");
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.WHITE);
        b1.setFont(new Font("Tahoma",Font.BOLD,15));
        b1.setBounds(60,450,110,35);
        b1.addActionListener(this);
        panel2.add(b1);

        b2 = new JButton("New Student");
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.WHITE);
        b2.setFont(new Font("Tahoma",Font.BOLD,15));
        b2.setBounds(250,450,150,35);
        panel2.add(b2);







        setSize(1190,700);
//        setLayout(new GridLayout(1,2));
        setLayout(null);
        setUndecorated(true);

        setLocation(100,20);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Loginpage();
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b1){
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
}
