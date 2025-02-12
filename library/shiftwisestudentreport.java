package library;






import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class shiftwisestudentreport extends JFrame {
    shiftwisestudentreport(){



        setTitle("JCombbox");
        setSize(634, 514);
        setLocation(491, 141);
        setLayout(null);
//        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(126, 181, 71));
//        JPanel panel = new JPanel();
//        panel.setLayout(null);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("liicon/shiftim.png"));
        Image image = imageIcon.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(50,170,550,300);
        add(label1);


        JLabel label = new JLabel("Choose Sift for View Student Record");
        label.setBounds(180,20,500,30);
        label.setForeground(Color.white);
        label.setFont(new Font("Arial",Font.BOLD,25));
        add(label);

        JButton button = new JButton("DASHBORAD");
        button.setBackground(Color.red);
        button.setForeground(Color.white);
        button.setFont(new Font("Tahoma",Font.BOLD,15));
        button.setBounds(10, 5, 150, 30);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);

            }
        });

        String[] options = {"Select", "Shift 6AM To 11AM","Shift 11AM To 5PM","Shift 6AM TO 5PM","Night Shift","ALL Shift"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setBounds(180,80,200,40);
        comboBox.setBackground(new Color(30, 82, 75));
        comboBox.setForeground(Color.white);
        comboBox.setFont(new Font("Aria",Font.BOLD,17));
        add(comboBox);

        // Action Listener
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBox.getSelectedItem();

                if (selectedItem.equals("Shift 6AM To 11AM")) {
                    shft1studentreport regForm = new shft1studentreport();
                    regForm.openForm();  // Pehla registration form khul jayega
                }
                if (selectedItem.equals("Shift 11AM To 5PM")) {
                    shift2studentreport regSecond = new shift2studentreport();
                    regSecond.openForm();  // Dusra registration form khul jayega
                }

                if (selectedItem.equals("Shift 6AM TO 5PM")) {
                    shift3studentreport regSecond = new shift3studentreport();;
                    regSecond.openForm();  // Dusra registration form khul jayega
                }
                if (selectedItem.equals("Night Shift")) {
                    shift4studentreport regSecond = new shift4studentreport();
                    regSecond.openForm();  // Dusra registration form khul jayega
                }

                if (selectedItem.equals("ALL Shift")) {
                    shift5studentreport regSecond = new shift5studentreport();
                    regSecond.openForm();  // Dusra registration form khul jayega

                }
                setVisible(false);
            }



        });





        setUndecorated(true);


        setVisible(true);
    }

    public static void main(String[] args) {
        new shiftwisestudentreport();
    }

}
