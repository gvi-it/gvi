package controller;

import java.sql.*;
//ss
public class Connect_DB {

    private String driver = "org.postgresql.Driver",server = "jdbc:postgresql://localhost/vgi?user=postgresql&password=linux-kubuntu";
    public Connection request = null;
    
    public Connect_DB() {
    
   // Class.forName(driver);
    
     try {
           this.request = DriverManager.getConnection("jdbc:postgresql://localhost/vgi","postgres","linux-kubuntu");
             System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //fgfd
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
