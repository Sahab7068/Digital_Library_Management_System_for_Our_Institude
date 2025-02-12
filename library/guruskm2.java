package library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guruskm2 extends JFrame {
    guruskm2(){
            JPanel panel = new GuruskmBanner();
        JButton button =new JButton(" Back ");
        button.setFont(new Font("Arial", Font.PLAIN, 19));
        button.setForeground(Color.white);
        button.setBackground(new Color(209, 8, 95));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setBounds(70, 10, 130, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
            }
        });

        add(button);
        add(panel);
        setBounds(250,130,900,500);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new guruskm2();
    }
}
