package library;

import org.jfree.chart.needle.ShipNeedle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class LibrarySystem extends JFrame {
    private JButton micButton;

    public LibrarySystem() {
        setTitle("Library Voice Assistant");
        setSize(80, 100);
        setAlwaysOnTop(true);
        setExtendedState(JFrame.NORMAL);
       setUndecorated(true);
       setBackground(new Color(255,0,0));
//        setOpacity(10.0f);

        setLocation(1260,30);
//        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // 🎤 Mic Button Design
            ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("liicon/mice.png"));
            Image image = imageIcon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
            ImageIcon imageIcon1 = new ImageIcon(image);



        micButton = new JButton(imageIcon1);
        micButton.setFont(new Font("Arial", Font.BOLD, 18));
        micButton.setBounds(-30,0,150,100);
        micButton.setBackground(Color.BLACK);
        micButton.setForeground(Color.WHITE);
        micButton.setFocusPainted(false);

























        micButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Mic Button Clicked! 🎤");

                try {
                    // 🔥 Python script ko call karna
                    ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Python313\\python.exe", "C:\\Users\\SP CYBER\\Desktop\\voice_assistant0.py");
                    Process process = pb.start();


                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    String response;
                    while ((response = reader.readLine()) != null) {
                        System.out.println("Voice Command Received: " + response);
                        handleVoiceCommand(response);
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        add(micButton);
        setVisible(true);
    }

     public void handleVoiceCommand(String command) {
         command = command.replace("You Said : ", "").trim();  // ✅ Extra text remove

         System.out.println("Voice Command Processed: " + command); // ✅ Debug ke liye






















         if (command.equalsIgnoreCase("morning time registration")) {
             new shift6amto11am().setVisible(true);
         }else if (command.equalsIgnoreCase(" ")){
             new shift11amto5am().setVisible(true);
         }

         else if (command.equalsIgnoreCase("second time registration")){
             new shift11amto5am().setVisible(true);
         }

         else if (command.equalsIgnoreCase("night student registration")){
             new nightshift().setVisible(true);
         }
         else if (command.equalsIgnoreCase("full time registration")){
             new fullshift().setVisible(true);

         }


         else if (command.contains("pichar") || command.contains("pichar dikhao") || command.contains("show pichart") || command.contains("show me pichart")){
             new pichart();
             setVisible(true);

         }
//         else if (command.contains("logout") || command.contains("band karo") || command.contains("close now")|| command.contains("report")) {
////             new sheet1().setVisible(true);
//            new Loginpage().setVisible(true);
//         }

         else if (command.contains("login karo") || command.contains("login") || command.contains("dashborad")|| command.contains("open dashborad")) {
//             new sheet1().setVisible(true);
             new AdminFrame().setVisible(true);
         }






         else if (command.equalsIgnoreCase("morning report")){
             new sheet1().setVisible(true);
             new shft1studentreport().setVisible(true);

         }

         else if (command.equalsIgnoreCase("all time report")){
             new sheet4().setVisible(true);
             new allshift().setVisible(true);

         }

         else if (command.equalsIgnoreCase("")){
             new Sift().setVisible(true);


         }
         else if (command.equalsIgnoreCase("seat ka report")){
             new sheetreport().setVisible(true);
         }


         else if (command.equalsIgnoreCase("logout")){
            new lgin().setVisible(true);
         }




         else if (command.equalsIgnoreCase("student report")){

               new shiftwisestudentreport().setVisible(true);

         }


         else if (command.equalsIgnoreCase("open chrome")) {
             try {
                 Runtime.getRuntime().exec("cmd /c start Aksar_Iss_Duniya_Mein_Anjane_Milte_Hain_(raj_Dhadkan)");
             } catch (Exception e) {
                 e.printStackTrace();
             }
         } else {
             System.out.println("❌ Command not recognized: " + command);
         }
     }



//         else if (command.equalsIgnoreCase("open chrome")) {
//             try {
//                 Runtime.getRuntime().exec("cmd /c start chrome");
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         } else {
//             System.out.println("❌ Command not recognized: " + command);
//         }
//     }






     // 🏆 Function: Voice Command Ke Basis Par JFrame Ya Feature Open Karna
//    public void handleVoiceCommand(String command) {
//        System.out.println("Voice Command Received: " + command);
//
//        if (command.equalsIgnoreCase("6AM to 11AM")) {
//            new sheetreport().setVisible(true);
//        } else if (command.equalsIgnoreCase("o 11AM to 4PM")) {
//            new shift11amto5am().setVisible(true);
//        } else if (command.equalsIgnoreCase("open shift 4PM to 9PM")) {
//            new shft1studentreport().setVisible(true);
//        } else if (command.equalsIgnoreCase("open student records")) {
//            new shift11amto5am().setVisible(true);
//        } else if (command.equalsIgnoreCase("open report page")) {
//            new shift4studentreport().setVisible(true);
//        } else if (command.equalsIgnoreCase("chrome open")) {
//            openChrome();
//        } else if (command.equalsIgnoreCase("open shift 6:00 a.m. to 11:00 a.m.")) {
//                new sheetreport(); // ✅ Chrome ka sahi function call karo
//            // ✅ Chrome ka sahi function call karo
//        } else if (command.startsWith("chrome open and search ")) {
//            searchInChrome(command.replace("chrome open and search ", ""));
//        } else if (command.startsWith("google search ")) {
//            googleSearch(command.replace("google search ", ""));
//        } else {
//            System.out.println("Command not recognized: " + command);
//        }
//    }

     private void Shift6AMTo11AM() {
         try {
             new ProcessBuilder("C:\\Users\\SP CYBER\\Downloads\\apk-aab-converter\\Apk-AAB-Converter-main\\guruskmlibrary\\src\\library\\Shift6AMTo11AM.java").start();
         } catch (Exception e) {
             e.printStackTrace();
         }
     }






     // 🌐 Chrome Open Karne Ka Function
    private void openChrome() {
       try {
            new ProcessBuilder("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe").start();
       } catch (Exception e) {
            e.printStackTrace();
       }
    }

    // 🔍 Chrome Me Search Karna
    private void searchInChrome(String query) {
        try {
            String url = "https://www.google.com/search?tbm=isch&q=" + query.replace(" ", "+");
            new ProcessBuilder("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", url).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔎 Google Pe Search Karna
    private void googleSearch(String query) {
        try {
            String url = "https://www.google.com/search?q=" + query.replace(" ", "+");
            new ProcessBuilder("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", url).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new LibrarySystem();
    }
}
