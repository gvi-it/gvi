/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import org.postgresql.Driver;

/**
 *
 * @author Preinstalleduser
 */ // Connect_DB vgi = new Connect_DB();
public class Connect_DB {

    private String driver = "org.postgresql.Driver",server = "jdbc:postgresql://localhost/vgi?user=postgresql&password=";
    public Connection request = null;
    
    public Connect_DB() {
    
   // Class.forName(driver);
    
     try {
           this.request = DriverManager.getConnection("jdbc:postgresql://localhost/vgi","postgres","");
             System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //fgfd
        }     
    }
}
