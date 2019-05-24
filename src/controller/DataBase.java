package controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class DataBase {

    private String ip = "192.168.77.101:3306", local = "localhost";
    private String postgresql = "org.postgresql.Driver",server = "jdbc:postgresql://192.168.77.71/vgi?user=postgresql&password=linux-kubuntu";
    private String mysql = "jdbc:mysql://"+ip+"/gvi";
    private String user = "root", password = "senha root";
    public Connection request = null;
    
    public DataBase() {

        try {
         
        Class.forName("com.mysql.jdbc.Driver");
        request = DriverManager.getConnection(mysql,user,password);
        System.out.println("Connected to the MySQL server successfully.");
    
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
           JOptionPane.showMessageDialog(null,"Service not started");
        System.exit(0);
        }     
    }
    
    public ResultSet execute(String sql){
   
        try{
         
        ResultSet query = this.request.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY).executeQuery(sql);
        
        return query;
  
        } catch(SQLException e){
                       System.out.println(e);
            return null;    
        }
    } 
}