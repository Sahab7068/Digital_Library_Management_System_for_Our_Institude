package library;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.ResultSet;






class shft1studentreport extends JFrame {
    JTable table;

    shft1studentreport() {
        JPanel paneln = new JPanel();
        paneln.setSize(700, 600);
        paneln.setBackground(new Color(88, 159, 175));
        paneln.setBounds(5, 5, 1200, 500);
        paneln.setLayout(null);
        paneln.setPreferredSize(new Dimension(getWidth(), 70));

        add(paneln);

        setUndecorated(true);


        JLabel label = new JLabel("6am to 11am SHEET REPORT");
        label.setBounds(150, 10, 700, 50);
        label.setFont(new Font("Tahoma", Font.BOLD, 30));
        paneln.add(label);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("liicon/re1.png"));
        Image image = imageIcon.getImage().getScaledInstance(200, 180, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(500, 250, 200, 200);
        paneln.add(label1);

        JButton button = new JButton("Back");
        button.setBackground(Color.red);
        button.setForeground(Color.white);
        button.setFont(new Font("Tahoma",Font.BOLD,20));
        button.setBounds(10, 5, 100, 30);
        paneln.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new shiftwisestudentreport();
                setVisible(false);
            }
        });

        // Close Button
        JLabel cancelButton = new JLabel("X");
        cancelButton.setBounds(1100, -8, 60, 60);
        cancelButton.setForeground(Color.black);
        cancelButton.setFont(new Font("Tahoma", Font.BOLD, 30));
        paneln.add(cancelButton);
        cancelButton.addMouseListener(new MouseListener() {
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

        // Create JTable
        table = new JTable();
        table.setForeground(new Color(10));
        table.setFont(new Font("Tahoma",Font.BOLD,20));
        table.setGridColor(new Color(52, 73, 94));
        table.setShowGrid(true);
        table.setFont(new Font("Tahoma", Font.BOLD, 12));

        // Apply alternating row colors for better readability
        table.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (row % 2 == 0) {
                    c.setFont(new Font("Tahoma",Font.BOLD,13));
                    c.setBackground(new Color(127, 170, 234)); // Light gray for even rows
                } else {
                    c.setFont(new Font("Tahoma",Font.BOLD,13));
                    c.setBackground(new Color(0x78EAD9)); // White for odd rows
                }
                return c;
            }
        });

        // Add JTable to JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setFont(new Font("Tahoma",Font.BOLD,25));
        scrollPane.setBounds(5, 100, 1200, 514);  // Adjust the scroll pane size and position
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Always show vertical scroll bar
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); // Show horizontal scroll bar when needed
        paneln.add(scrollPane);

        try {
            // Database connection and result fetching
            sqlconn c = new sqlconn();
            String q = "SELECT * FROM studentr"; // Query to fetch data
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }



        JButton printButton = new JButton("Print Table");
        printButton.setBounds(800, 10, 100, 30);
        printButton.setBackground(Color.GREEN);
        paneln.add(printButton);

        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    boolean complete = table.print();
                    if (complete) {
                        JOptionPane.showMessageDialog(null, "Printing Complete!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Printing Canceled!");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });



        JButton exportButton = new JButton("Export to Excel");
        exportButton.setBounds(920, 10, 150, 30);
        exportButton.setBackground(Color.CYAN);
        paneln.add(exportButton);

        exportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setDialogTitle("Save Excel File");
                    int userSelection = fileChooser.showSaveDialog(null);
                    if (userSelection == JFileChooser.APPROVE_OPTION) {
                        java.io.File fileToSave = fileChooser.getSelectedFile();
                        FileWriter fw = new FileWriter(fileToSave + ".csv");
                        BufferedWriter bw = new BufferedWriter(fw);

                        for (int i = 0; i < table.getColumnCount(); i++) {
                            bw.write(table.getColumnName(i) + ",");
                        }
                        bw.newLine();

                        for (int i = 0; i < table.getRowCount(); i++) {
                            for (int j = 0; j < table.getColumnCount(); j++) {
                                bw.write(table.getValueAt(i, j).toString() + ",");
                            }
                            bw.newLine();
                        }

                        bw.close();
                        fw.close();
                        JOptionPane.showMessageDialog(null, "Data exported successfully!");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
































        // Frame properties
        setSize(1220, 514);
        setLocation(100, 100);
        setTitle("Student Records");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new shft1studentreport();
    }

    public void openForm() {
    }
}
