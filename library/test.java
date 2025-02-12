package library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class StylishConfirmationFrame extends JFrame {

    public StylishConfirmationFrame() {
        setTitle("Confirmation");
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Custom panel for background color
        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gradient = new GradientPaint(0, 0, new Color(255, 0, 0), getWidth(), getHeight(), new Color(231, 244, 29));
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        mainPanel.setLayout(new BorderLayout(10, 10));

        // Label panel
        JPanel panelTop = new JPanel();
        panelTop.setOpaque(false); // Transparent panel
        JLabel label = new JLabel("Are you sure?");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setForeground(Color.WHITE);
        panelTop.add(label);
        mainPanel.add(panelTop, BorderLayout.CENTER);

        // Button panel
        JPanel panelBottom = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelBottom.setOpaque(false); // Transparent panel
        JButton yesButton = createStyledButton("Yes", new Color(34, 167, 240));
        JButton backButton = createStyledButton("Back", new Color(231, 76, 60));

        panelBottom.add(yesButton);
        panelBottom.add(backButton);
        mainPanel.add(panelBottom, BorderLayout.SOUTH);

        add(mainPanel);

        // Button Actions
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You clicked Yes!");
                new Loginpage();
                dispose(); // Close the window
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Going Back...");
                new AdminFrame();
                dispose(); // Close the window
            }
        });

        setUndecorated(true); // Removes default title bar
        getRootPane().setWindowDecorationStyle(JRootPane.NONE); // Optional
        setVisible(true);
    }

    // Create styled buttons
    private JButton createStyledButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setPreferredSize(new Dimension(120, 40));
        button.setBackground(bgColor);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setOpaque(true);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return button;
    }

    public static void main(String[] args) {
        new StylishConfirmationFrame();
    }
}
