package library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

class GuruskmBanner extends JPanel {

    public GuruskmBanner() {
        setPreferredSize(new Dimension(900, 400)); // Banner size
        setLayout(null); // Absolute positioning
            ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("liicon/SKMS.PNG"));
            Image image = imageIcon.getImage().getScaledInstance(220,200,Image.SCALE_DEFAULT);
            ImageIcon imageIcon1 = new ImageIcon(image);
            JLabel label = new JLabel(imageIcon1);
            label.setBounds(650, 40, 220, 200);;

        // Website Link as JLabel



        JLabel websiteLabel = new JLabel("<html><a href =https://guruskm.com/> BOOK NOW  </a><</html>");
        websiteLabel.setFont(new Font("Arial", Font.PLAIN, 19));
        websiteLabel.setForeground(Color.white);
        websiteLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        websiteLabel.setBounds(70, 210, 200, 20); // Set position

        // Add Mouse Click Listener to open website
        websiteLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://guruskm.com/"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        add(websiteLabel);
        add(label);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Gradient background
        GradientPaint gradient = new GradientPaint(0, 0, new Color(98, 232, 7, 255), getWidth(), getHeight(), new Color(254, 255, 252));
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Main title
        g2d.setFont(new Font("Cooper Black", Font.BOLD, 36));
        g2d.setColor(Color.WHITE);
        g2d.drawString("EXPLORE THE GURU SKM", 50, 120);

        // Subtitle
        g2d.setFont(new Font("Arial", Font.PLAIN, 16));
        g2d.drawString("Bridge the gap between learning & industry.", 50, 160);

        // Button
        g2d.setColor(new Color(10, 152, 6));
        g2d.fillRoundRect(50, 200, 140, 40, 20, 20);
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 18));
        g2d.drawString("", 75, 228);

        // Contact Info
        g2d.setFont(new Font("Arial", Font.PLAIN, 14));
        g2d.drawString("📞 0708344101", 200, 220);
        g2d.drawString("Email: info@guruskm.com", 200, 260);
    }

    public static void main(String[] args) {


        JFrame frame = new JFrame("Guruskm About");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GuruskmBanner());


        frame.pack();
        frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
