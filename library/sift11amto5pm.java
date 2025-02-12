package library;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

 class shift11amto5am extends JFrame implements ActionListener {
    JTextField namefiled,fathername,mobile_no,exam,diposit , time;
    //    JButton registerButton;
//    JComboBox<String> comboBox;
    JRadioButton r1 ,r2;
    Choice c1;
    JLabel date;
    JButton b1 ,b2;
    shift11amto5am() {
        setSize(634, 514);
        setLocation(491, 141);
        setTitle("Sift 6AM TO 11 AM ");
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(41, 128, 185)); // Blue shade
        panel.setBounds(0,0,634,514);
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(getWidth(), 70));
        add(panel);



        JLabel label = new JLabel("SHIFT 11AM TO 5PM ");
        label.setBounds(3,-8,260,53);
        label.setForeground(Color.yellow);
        label.setFont(new Font("Tahoma ",Font.BOLD,15));
        panel.add(label);

        time = new JTextField();

        JLabel label1 = new JLabel("ADD NEW STUDENT ");
        label1.setBounds(200,15,260,53);
        label1.setForeground(Color.white);
        label1.setFont(new Font("Tahoma ",Font.BOLD,20));
        panel.add(label1);

        JLabel label2 = new JLabel("Seet No : ");
        label2.setFont(new Font("Tahoma",Font.BOLD,15));
        label2.setForeground(Color.WHITE);
        label2.setBounds(40,60,260,53);
        panel.add(label2);

        c1 = new Choice();
        try {
            sqlconn c = new sqlconn();
            ResultSet resultSet = c.statement.executeQuery("select * from sheet2");
            while (resultSet.next()){
                c1.add(resultSet.getString("seet_no"));

            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        c1.setBounds(250,65,150,25);
//        c1.setFont(new Font("Tahoma",Font.BOLD,15));
        c1.setForeground(Color.WHITE);
        c1.setForeground(new Color(3,45,48));
        panel.add(c1);




        JLabel label3 = new JLabel("Student Name  : ");
        label3.setFont(new Font("Tahoma",Font.BOLD,15));
        label3.setForeground(Color.WHITE);
        label3.setBounds(40,100,260,53);
        panel.add(label3);

        namefiled = new JTextField();
        namefiled.setBounds(250,116,180,20);
        namefiled.setFont(new Font("Tahoma",Font.BOLD,14));
//    textFieldnumber.setBackground(new Color(9, 150, 136));
        namefiled.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        panel.add(namefiled);

        JLabel label4 = new JLabel("Father Name  : ");
        label4.setFont(new Font("Tahoma",Font.BOLD,15));
        label4.setForeground(Color.WHITE);
        label4.setBounds(40,140,260,53);
        panel.add(label4);

        fathername = new JTextField();
        fathername.setBounds(250,160,180,20);
        fathername.setFont(new Font("Tahoma",Font.BOLD,14));
//    textFieldnumber.setBackground(new Color(9, 150, 136));
        fathername.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        panel.add(fathername);

        JLabel label5 = new JLabel("Mobile Number : ");
        label5.setFont(new Font("Tahoma",Font.BOLD,15));
        label5.setForeground(Color.WHITE);
        label5.setBounds(40,180,260,53);
        panel.add(label5);

        mobile_no = new JTextField();
        mobile_no.setBounds(250,195,180,20);
        mobile_no.setFont(new Font("Tahoma",Font.BOLD,14));
//    textFieldnumber.setBackground(new Color(9, 150, 136));
        mobile_no.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        panel.add(mobile_no);



        JLabel label6 = new JLabel("Gender : ");
        label6.setFont(new Font("Tahoma",Font.BOLD,15));
        label6.setForeground(Color.WHITE);
        label6.setBounds(40,220,260,53);
        panel.add(label6);

        r1 =new JRadioButton("Male");
        r1.setBounds(250,235,80,15);
        r1.setForeground(Color.white);
        r1.setFont(new Font("Tahoma",Font.BOLD,15));
        r1.setBackground(new Color(41, 128, 185));

        panel.add(r1);

        r2 =new JRadioButton("Female");
        r2.setBounds(350,235,80,15);
        r2.setForeground(Color.white);
        r2.setFont(new Font("Tahoma",Font.BOLD,15));
        r2.setBackground(new Color(41, 128, 185));

        panel.add(r2);



        JLabel label7 = new JLabel("Exam Name : ");
        label7.setFont(new Font("Tahoma",Font.BOLD,15));
        label7.setForeground(Color.WHITE);
        label7.setBounds(40,260,260,53);
        panel.add(label7);

        exam = new JTextField();
        exam.setBounds(250,270,180,20);
        exam.setFont(new Font("Tahoma",Font.BOLD,14));
//    textFieldnumber.setBackground(new Color(9, 150, 136));
        exam.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        panel.add(exam);

//        JLabel label8 = new JLabel("Joining Date : ");
//        label8.setFont(new Font("Tahoma",Font.BOLD,15));
//        label8.setForeground(Color.WHITE);
//       label8.setBounds(40,300,260,53);
//        panel.add(label8);



        date = new JLabel("Date and Time : ");
        date.setBounds(40,310,260,30);
        date.setFont(new Font("Tahoma",Font.BOLD,15));
        date.setForeground(Color.white);
        panel.add(date);

        Date date1 = new Date();
        date = new JLabel(""+date1);
        date.setBounds(250,310,300,14);
        date.setFont(new Font("Tahoma",Font.BOLD,15));
        date.setForeground(Color.white);
        panel.add(date);




        JLabel label9 = new JLabel("Fee Deposit : ");
        label9.setFont(new Font("Tahoma",Font.BOLD,15));
        label9.setForeground(Color.WHITE);
        label9.setBounds(40,340,260,53);
        panel.add(label9);

        diposit = new JTextField();
        diposit.setBounds(250,352,180,20);
        diposit.setFont(new Font("Tahoma",Font.BOLD,14));
//    textFieldnumber.setBackground(new Color(9, 150, 136));
        diposit.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        panel.add(diposit);


        b1 = new JButton("ADD");
        b1.setBounds(100,420,100,30);
        b1.setFont(new Font("Tahoma",Font.BOLD,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        panel.add(b1);


        b2 = new JButton("Back");
        b2.setBounds(300,420,100,30);
        b2.setFont(new Font("Tahoma",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
//        b2.addActionListener(this);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Sift();
                setVisible(false);
            }
        });
        panel.add(b2);







        setVisible(true);


    }

    public static void main(String[] args) {
        new shift11amto5am();
    }


    public void openForm() {
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            sqlconn c = new sqlconn();
            String redioBTN = null;

            if (r1.isSelected()) {
                redioBTN = "Male";
            } else if (r2.isSelected()) {
                redioBTN = "Female";
            }

            String s1 = c1.getSelectedItem(); // Seat Number
            String s2 = namefiled.getText();
            String s3 = fathername.getText();
            String s4 = mobile_no.getText();
            String s5 = redioBTN;
            String s6 = exam.getText();
            String s7 = date.getText();
            String s8 = diposit.getText();
            String s9 = time.getText();

            // **Step 1: Check for empty fields**
            if (s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s6.isEmpty() || s7.isEmpty() || s8.isEmpty()) {
                showErrorDialog("All fields must be filled!", s2);
                return;
            }

            // **Step 2: Check if seat is already reserved**
            try {
                String checkQuery = "SELECT availbilty FROM sheet2 WHERE seet_no = '" + s1 + "'";
                ResultSet rs = c.statement.executeQuery(checkQuery);
                if (rs.next()) {
                    String status = rs.getString("availbilty");
                    if (status.equalsIgnoreCase("Reserved")) {
                        showErrorDialog(s1,s2);

                        return;
                    }
                }



                Timer timer1 = new Timer();
                timer1.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        try {
                            String q4 = "UPDATE studentr2 SET seetDrop_time = NOW() WHERE seet_no = '" + s1 + "'";
                            c.statement.executeUpdate(q4);
                            String q5 = " Shift 11 AM To 5PM OF " + s1 + " is Expired.";
                            c.statement.executeUpdate(q5);

                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }, 60000);










                // **Step 3: Insert student details and update seat availability**
                String q = "INSERT INTO studentr2 VALUES('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "','" + s6 + "','" + s7 + "','" + s8 + "','"+s9+"')";
                String q1 = "UPDATE sheet2 SET availbilty = 'Reserved' WHERE seet_no = '" + s1 + "'";
                String q6 = "UPDATE studentr2 SET seetDrop_time = 'Active' WHERE mobile = '" + s4 + "'";
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q6);

                showSuccessDialog(s1, s2);
                setVisible(false);

                // **Step 4: Schedule Automatic Seat Release After 1 Month**
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        try {
                            String q2 = "UPDATE sheet2 SET availbilty = 'Available' WHERE seet_no = '" + s1 + "'";
                            c.statement.executeUpdate(q2);
                            String q3 = " Shift 6 AM To 11AM OF " + s1 + " is now available again.";
                            c.statement.executeUpdate(q3);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }, 60000); // 30 days

            } catch (Exception ex) {
                ex.printStackTrace();
                showErrorDialog("Database Error!", s2);
            }
        } else {
            setVisible(false);
        }
    }

     // **Custom Success Dialog**
     private void showSuccessDialog(String seatNo, String name) {
         JDialog dialog = new JDialog();
         dialog.setTitle("Success");
         dialog.setSize(350, 200);
         dialog.setLocationRelativeTo(null);
         dialog.setModal(true);
         dialog.setUndecorated(true);

         JPanel panel = new JPanel();
         panel.setBackground(Color.WHITE);
         panel.setLayout(new BorderLayout());
         panel.setBorder(BorderFactory.createLineBorder(new Color(76, 175, 80), 3));

         JLabel label = new JLabel("<html>"
                 + "<div style='text-align: center; font-family: Arial, sans-serif;'>"
                 + "<h2 style='color: green;'>✔ Success</h2>"
                 + "<p style='font-size: 14px; color: black;'>"
                 + "Shift 11 AM To 5PM OF Seat No: <b>" + seatNo + "</b> <br>"
                 + "Name: <b>" + name + "</b> <br>"
                 + "Booked Successfully!"
                 + "</p>"
                 + "</div></html>");
         label.setHorizontalAlignment(SwingConstants.CENTER);

         JButton okButton = new JButton("OK");
         okButton.setBackground(new Color(76, 175, 80));
         okButton.setForeground(Color.WHITE);
         okButton.setFont(new Font("Arial", Font.BOLD, 14));
         okButton.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));

         okButton.addActionListener(e -> dialog.dispose());

         JPanel buttonPanel = new JPanel();
         buttonPanel.setBackground(Color.WHITE);
         buttonPanel.add(okButton);

         panel.add(label, BorderLayout.CENTER);
         panel.add(buttonPanel, BorderLayout.SOUTH);

         dialog.add(panel);
         dialog.setVisible(true);
     }
     // **Custom Error Dialog**
     private void showErrorDialog(String message, String name) {
         JDialog dialog = new JDialog();
         dialog.setTitle("Error");
         dialog.setSize(350, 200);
         dialog.setLocationRelativeTo(null);
         dialog.setModal(true);
         dialog.setUndecorated(true);

         JPanel panel = new JPanel();
         panel.setBackground(Color.WHITE);
         panel.setLayout(new BorderLayout());
         panel.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

         JLabel label = new JLabel("<html>"
                 + "<div style='text-align: center; font-family: Arial, sans-serif;'>"
                 + "<h2 style='color: red;'>✖ Error</h2>"
                 + "<p style='font-size: 14px; color: black;'>"
                 + "This Sheet  "+message +" is Alrady Reserved For One Month"+ "</b>"
                 + "</p>"
                 + "</div></html>");
         label.setHorizontalAlignment(SwingConstants.CENTER);

         JButton okButton = new JButton("OK");
         okButton.setBackground(Color.RED);
         okButton.setForeground(Color.WHITE);
         okButton.setFont(new Font("Arial", Font.BOLD, 14));
         okButton.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));

         okButton.addActionListener(e -> dialog.dispose());

         JPanel buttonPanel = new JPanel();
         buttonPanel.setBackground(Color.WHITE);
         buttonPanel.add(okButton);

         panel.add(label, BorderLayout.CENTER);
         panel.add(buttonPanel, BorderLayout.SOUTH);

         dialog.add(panel);
         dialog.setVisible(true);
     }

 }