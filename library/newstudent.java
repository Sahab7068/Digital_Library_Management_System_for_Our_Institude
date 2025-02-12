package library;

import javax.swing.*;
import java.awt.*;

 class TwoPanelsWithGradients {
    public static void main(String[] args) {

        // Absolute positioning to manually set positions

        // ✅ Step 1: Panel 1 create karein (Blue to Red gradient)
        JPanel panel1 = createGradientPanel(Color.BLUE, Color.RED);
        panel1.setBounds(50, 50, 250, 150); // Position and size of panel1

        // ✅ Step 2: Panel 2 create karein (Green to Yellow gradient)
         // Position and size of panel2

        // ✅ Step 3: Panels ko JFrame me add karen

//        frame.add(panel2);

        // Display the frame

    }

    // ✅ Step 4: Gradient Panel create karne ka method
    public static JPanel createGradientPanel(Color color1, Color color2) {
        return new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                int width = getWidth();
                int height = getHeight();

                // ✅ Gradient color define karen (color1 to color2)
                GradientPaint gp = new GradientPaint(0, 0, color1, width, height, color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, width, height);
            }
        };
    }
}
