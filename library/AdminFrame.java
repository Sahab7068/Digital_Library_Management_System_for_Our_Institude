package library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;


class AdminPanel {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdminFrame());
    }
}

class AdminFrame extends JFrame implements ActionListener{
    private JPanel contentPanel;
    private CardLayout cardLayout;

    AdminFrame() {
        setTitle("University Admin Panel");
        setSize(900, 600);
//        setUndecorated(true);
//        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
//        setUndecorated(true);
        setLayout(new BorderLayout());


        // Sidebar Panel
        JPanel sidebar = new JPanel();
        sidebar.setPreferredSize(new Dimension(250, getHeight()));
        sidebar.setBackground(new Color(4, 39, 145));
        sidebar.setLayout(new GridLayout(8, 1, 5, 5));

        JLabel title = new JLabel("GURU SKM Panel", SwingConstants.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        sidebar.add(title);

        // Content Panel with Card Layout
        contentPanel = new JPanel();
        cardLayout = new CardLayout();
        contentPanel.setLayout(cardLayout);
        contentPanel.setBackground(new Color(154, 214, 228));

        // Adding Home Page
        JPanel homePanel = new JPanel();
        homePanel.setLayout(null);
//        homePanel.setLayout(new BorderLayout());
        homePanel.setBackground(new Color(195, 102, 243));
        JLabel header = new JLabel("Welcome to GURU SKM  Admin Panel", SwingConstants.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 25));
        header.setForeground(Color.BLACK);
        homePanel.add(header, BorderLayout.NORTH);
        homePanel.add(new JLabel("Manage university data efficiently.", SwingConstants.CENTER), BorderLayout.CENTER);
        contentPanel.add(homePanel, "Home");


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("liicon/chil.png"));
        Image image = imageIcon.getImage().getScaledInstance(634,514,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);


//        setLocation(491, 141);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(1, 1,634,514);

        homePanel.add(label);


        String[] menuItems = {"Dashboard", "ADD NEW STUDENT", "SHEET REPORT", "STUDENT RECORD", "PiChart", "Control With Voice", "Log Out"};
        for (String item : menuItems) {
            JButton button = new JButton(item);
            button.setBackground(new Color(53, 29, 200));
            button.setForeground(Color.WHITE);
            button.setFocusPainted(false);
            button.setBorderPainted(false);
            button.setFont(new Font("Arial", Font.PLAIN, 14));
            button.setCursor(new Cursor(Cursor.HAND_CURSOR));

            // Student button ke liye special action listener
            if (item.equals("STUDEN RECORD")) {
                button.addActionListener(e -> new shiftwisestudentreport());
            } else if (item.equals("Logout")) {
                button.addActionListener(e -> System.exit(0)); // Logout button pe program close ho jayega
            } else {
                button.addActionListener(new PanelSwitcher(item));
            }


            if (item.equals("PiChart")){
                button.addActionListener(e -> new pichart());
            }else {
                button.addActionListener(new PanelSwitcher(item));
            }

            if (item.equals("Control With Voice")){
                button.addActionListener(e -> new LibrarySystem());
            }else {
                button.addActionListener(new PanelSwitcher(item));
            }


            if (item.equals("Dashboard")){
                button.addActionListener(e -> new guruskm2());
            }else {
                button.addActionListener(new PanelSwitcher(item));
            }

            if (item.equals("Log Out")) {
                button.addActionListener(e -> new StylishConfirmationFrame());
              // Logout button pe program close ho jayega
            } else {
                button.addActionListener(new PanelSwitcher(item));
            }


            if (item.equals("SHEET REPORT")) {
                button.addActionListener(e -> new sheetreport());
            // Logout button pe program close ho jayega
            } else {
                button.addActionListener(new PanelSwitcher(item));
            }





            if (item.equals("ADD NEW STUDENT")) {
                button.addActionListener(e ->new Sift());
            } else {
                button.addActionListener(new PanelSwitcher(item));
            }



            if (item.equals("STUDENT RECORD")) {
                button.addActionListener(e ->new shiftwisestudentreport());
            } else {
                button.addActionListener(new PanelSwitcher(item));
            }



            sidebar.add(button);

            JPanel panel = new JPanel();
            panel.setBackground(new Color(227, 217, 127));
            panel.setLayout(new BorderLayout());
            panel.add(new JLabel(item, SwingConstants.CENTER), BorderLayout.CENTER);
            contentPanel.add(panel, item);
        }

        // Sidebar toggle button (three-line icon)
        JButton toggleButton = new JButton("☰");
        toggleButton.setFont(new Font("Arial", Font.PLAIN, 30));
        toggleButton.setBackground(new Color(213, 66, 47));
        toggleButton.setForeground(Color.WHITE);
        toggleButton.setBorderPainted(false);
        toggleButton.setFocusPainted(false);
        toggleButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Toggle Sidebar Visibility
        toggleButton.addActionListener(e -> sidebar.setVisible(!sidebar.isVisible()));

        // Adding components to the frame
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(225, 11, 248));

        topPanel.add(toggleButton, BorderLayout.WEST);
        topPanel.add(new JLabel("Admin Panel", SwingConstants.LEFT), BorderLayout.CENTER);

//        topPanel.add(new JLabel(SwingConstants.CENTER), BorderLayout.CENTER);





        add(topPanel, BorderLayout.NORTH);
        add(sidebar, BorderLayout.WEST);
        add(contentPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }


    class PanelSwitcher implements ActionListener {
        private String panelName;

        PanelSwitcher(String panelName) {
            this.panelName = panelName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            cardLayout.show(contentPanel, panelName);
        }
    }
}

// Student Registration Form
class StudentRegistrationForm extends JFrame implements ActionListener{
        JTextField namefiled,numberfiled,emailfiled,asprentfiled,dpart;
        JComboBox seatno;
    JButton registerButton;
    JRadioButton r1,r2;
    StudentRegistrationForm() {
        setTitle("Student Registration");
        setSize(634, 514);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setLocation(491,141);
        setLayout(new BorderLayout());

        // Header Panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(205, 29, 176, 200)); // Blue shade
        headerPanel.setPreferredSize(new Dimension(getWidth(), 70));


        JLabel titleLabel = new JLabel("New Student Registration", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setForeground(Color.WHITE);
        headerPanel.add(titleLabel);

//        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});


        // Main Form Panel
        JPanel formPanel = new JPanel();
//        formPanel.setLayout(null);
        formPanel.setLayout(new GridLayout(10, 2, 15, 15));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 80, 20, 100)); // Padding

//       JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
////       comboBox.setBounds(100,100,50,30);
//       formPanel.add(comboBox);

        formPanel.add(new JLabel("Seat No"));
        seatno = new JComboBox<>();
        for (int i = 1; i <= 100; i++) {
            seatno.addItem(String.valueOf(i)); // Convert int to String
        }
        formPanel.add(seatno);



        // Form Fields
        formPanel.add(new JLabel("Student Name:"));
         namefiled = new JTextField();
        formPanel.add(namefiled);

        formPanel.add(new JLabel("Gender"));
        r1 = new JRadioButton("Male");
//        r2 = new JRadioButton("Female");
        formPanel.add(r1);

        formPanel.add(new JLabel());
        r2 = new JRadioButton("Female");
        formPanel.add(r2);

        formPanel.add(new JLabel("Mobile No :"));
         numberfiled = new JTextField();
        formPanel.add(numberfiled);

        formPanel.add(new JLabel("Email:"));
         emailfiled = new JTextField();
        formPanel.add(emailfiled);

        formPanel.add(new JLabel("Aspirants :"));
        asprentfiled = new JTextField();
        formPanel.add(asprentfiled);

        formPanel.add(new JLabel("Department:"));
        dpart = new JTextField();
        formPanel.add(dpart);



        // Register Button
         registerButton = new JButton("Register");
        registerButton.setFont(new Font("Arial", Font.BOLD, 16));
        registerButton.setBackground(new Color(46, 204, 113)); // Green
        registerButton.setForeground(Color.WHITE);
        registerButton.setBorderPainted(false);
        registerButton.setFocusPainted(false);
        registerButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        registerButton.addActionListener(this);
        registerButton.setPreferredSize(new Dimension(150, 40));

        // Register Button Action
//        registerButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null, "Student Registered Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
//            }
//        });

        // Footer Panel for Centered Button
        JPanel footerPanel = new JPanel();
        footerPanel.add(registerButton);

        // Add Components to Frame
        add(headerPanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(footerPanel, BorderLayout.SOUTH);

        setVisible(true);
    }




    public static void main(String[] args) {

        new StudentRegistrationForm();
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == registerButton) {
        sqlconn c = new sqlconn();
        String gender = null;

        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }

        String seatNumber = (String) seatno.getSelectedItem();
        String studentName = namefiled.getText();
        String mobileNumber = numberfiled.getText();
        String email = emailfiled.getText();
        String aspirant = asprentfiled.getText();
        String department = dpart.getText();

        try {
            // ✅ Corrected Query with Actual Column Names
            String query = "INSERT INTO stu (seat, name, mobile, gender, email, aspirants, department) VALUES (?, ?, ?, ?, ?, ?, ?)";

            // Using PreparedStatement to Prevent SQL Injection
            PreparedStatement pstmt = c.connection.prepareStatement(query);
            pstmt.setString(1, seatNumber);
            pstmt.setString(2, studentName);
            pstmt.setString(3, mobileNumber);
            pstmt.setString(4, gender);
            pstmt.setString(5, email);
            pstmt.setString(6, aspirant);
            pstmt.setString(7, department);

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Student Registered Successfully!");
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Error: Student registration failed!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } else {
        setVisible(false);
    }

}

    public void openForm() {
    }

    static class newcourse extends JFrame {
    newcourse(){
        setTitle("Student Registration");
        setLayout(null);
        setUndecorated(true);
        setSize(634, 514);
//        getContentPane().setBackground(Color.YELLOW);

        setLocation(491,141);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



        JButton submitButton = new JButton("Register");
        submitButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Student Registered Successfully!"));
        add(submitButton);

        setVisible(true);
    }}}