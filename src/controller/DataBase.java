package controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//ss
public class DataBase {

    private String postgresql = "org.postgresql.Driver",server = "jdbc:postgresql://192.168.77.70/vgi?user=postgresql&password=linux-kubuntu";
    private String mysql = "jdbc:mysql://192.168.77.70:3306/gvi";
    private String user = "root", password = "senha root";
    public Connection request = null;
    
    public DataBase() {

    try {
         
         try { 
             Class.forName("com.mysql.jdbc.Driver");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
         }
           this.request = DriverManager.getConnection(mysql,user,password);
             System.out.println("Connected to the MySQL server successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
           JOptionPane.showMessageDialog(null,"Service not started");
        System.exit(0);
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