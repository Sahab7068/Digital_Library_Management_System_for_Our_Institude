package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class sqlconn {
//    public Connection conn;
    Connection connection;
    Statement statement;

    public sqlconn(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/guruskm_library","root","");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
