package Main;

import java.sql.*;

public class DBConnection {
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/database";
    static final String USER = "root";
    static final String PASS = "nasib10stars26";
    public static Connection connectDB(){
        Connection conn= null;
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER, PASS);
            return conn;
        }catch(Exception ex){
            System.out.println("There were errors while connectiong to db");
            return null;
        }
    }
}