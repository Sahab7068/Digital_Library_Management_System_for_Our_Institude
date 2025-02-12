package library;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;
//import org.jfree.chart.util.Rotation;

import javax.swing.*;
import java.awt.*;

class pichart {
    public static void main(String[] args) {
        new pichart();

    }
    pichart(){
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Shift-wise Registration Distribution");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(634, 514);
            frame.setLocation(491, 141);
            frame.setLayout(new BorderLayout());

            JLabel titleLabel = new JLabel("Shift-wise Registration Distribution", SwingConstants.CENTER);
            titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(titleLabel, BorderLayout.NORTH);

            // Creating dataset
            DefaultPieDataset dataset = new DefaultPieDataset();
            dataset.setValue("Shift 6AM-11AM", 30);
            dataset.setValue("Shift 11AM-5PM", 25);
            dataset.setValue("Shift 6AM-5PM", 20);
            dataset.setValue("Night Shift", 15);
            dataset.setValue("Full Seat", 10);

            // Creating 3D chart
            JFreeChart chart = ChartFactory.createPieChart3D(
                    "",
                    dataset,
                    true,
                    true,
                    false);

            PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(290);
            plot.setDirection(Rotation.ANTICLOCKWISE);
            plot.setForegroundAlpha(0.7f);
            plot.setDepthFactor(0.15);

            // Setting dark color scheme
            plot.setBackgroundPaint(Color.WHITE);
            plot.setOutlinePaint(Color.BLACK);
            plot.setSectionPaint("Shift 6AM-11AM", new Color(178, 34, 34)); // Dark Red
            plot.setSectionPaint("Shift 11AM-5PM", new Color(0, 0, 139));   // Dark Blue
            plot.setSectionPaint("Shift 6AM-5PM", new Color(34, 139, 34));  // Dark Green
            plot.setSectionPaint("Night Shift", new Color(255, 140, 0));   // Dark Orange
            plot.setSectionPaint("Full Seat", new Color(128, 0, 128));     // Dark Purple
            plot.setSimpleLabels(true);

            // Adding chart to panel
            ChartPanel chartPanel = new ChartPanel(chart);
            frame.add(chartPanel, BorderLayout.CENTER);

            // Adding a close button
            JButton closeButton = new JButton("Close");
            closeButton.addActionListener(e -> frame.dispose());
            JPanel buttonPanel = new JPanel();
            buttonPanel.add(closeButton);
            
            frame.add(buttonPanel, BorderLayout.SOUTH);
            frame.getContentPane().setBackground(Color.white);
            frame.setVisible(true);
        });
    }
}