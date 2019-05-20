package controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//ss
public class Connect_DB {

    private String postgresql = "org.postgresql.Driver",server = "jdbc:postgresql://192.168.77.70/vgi?user=postgresql&password=linux-kubuntu";
    private String mysql = "jdbc:mysql://192.168.77.70:3306/gvi";
    private String user = "root", password = "senha root";
    public Connection request = null;
    
    public Connect_DB() {

    try {
         
         try { 
             Class.forName("com.mysql.jdbc.Driver");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Connect_DB.class.getName()).log(Level.SEVERE, null, ex);
         }
           this.request = DriverManager.getConnection(mysql,user,password);
             System.out.println("Connected to the MySQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }     
    }
    
    public ResultSet execute(String sql){
   
        try{
         
        ResultSet query = this.request.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY).executeQuery(sql);
        
        return query;
  
        } catch(SQLException e){
        e.printStackTrace();
            return null;    
        }
    } 
}
