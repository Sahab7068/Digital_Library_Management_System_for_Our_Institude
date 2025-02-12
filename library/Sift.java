package library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Sift extends JFrame {
    Sift(){

        setUndecorated(true);

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
        JLabel label = new JLabel("X");
        label.setBounds(600,0,50,50);
        label.setBackground(Color.red);
        label.setFont(new Font("Tahoma",Font.BOLD,25));
        add(label);
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
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


        JLabel labelx = new JLabel("Choose Your Sift");
        labelx.setBounds(180,20,300,30);
        labelx.setForeground(Color.white);
        labelx.setFont(new Font("Arial",Font.BOLD,25));
        add(labelx);

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
                    shift6amto11am regForm = new shift6amto11am();
                    regForm.openForm();  // Pehla registration form khul jayega
                }
                if (selectedItem.equals("Shift 11AM To 5PM")) {
                    shift11amto5am regSecond = new shift11amto5am();
                    regSecond.openForm();  // Dusra registration form khul jayega
                }

                if (selectedItem.equals("Shift 6AM TO 5PM")) {
                    shift6amto5pm regSecond = new shift6amto5pm();
                    regSecond.openForm();  // Dusra registration form khul jayega
                }
                if (selectedItem.equals("Night Shift")) {
                    nightshift regSecond = new nightshift();
                    regSecond.openForm();  // Dusra registration form khul jayega
                }

                if (selectedItem.equals("ALL Shift")) {
                    fullshift regSecond = new fullshift();
                    regSecond.openForm();  // Dusra registration form khul jayega

                }
            setVisible(false);
            }



        });








        setVisible(true);
    }

    public static void main(String[] args) {

   new Sift();
    }

}