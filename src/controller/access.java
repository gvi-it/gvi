package controller;

import model.*;
import view.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import librerias.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import libraries.require;

public class access implements ActionListener{    
    
    login view = new login();
    executive model;
    
    public access(){
        
    this.view = view;
    this.model = model;

    this.view.close.addActionListener(this);
    this.view.btn.addActionListener(this);
    
    this.config();
        
    }
    
    public void execute(){
    this.view.setVisible(true);
    this.view.setLocationRelativeTo(null);
    }
    
    private void config(){
  //  new Placeholder("customerservice@gerenciavirtual.net",this.view.email);  
   // new Placeholder("************",this.view.password);
    
    require valForm = new require(this.view);
    valForm.placeholder(0,"customerservice@gerenciavirtual.net");
    
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
  
        if(e.getSource().equals(view.btn)){
           
            try {          
                //conexion               
                Connect_DB vgi =  new Connect_DB();
                
                ResultSet query = vgi.execute("SELECT * FROM executive WHERE email ='"+this.view.email.getText().toString()+"' and password ='"+this.view.password.getText().toString()+"'");
                
                query.next();
                
                if(query.getString("email") != "" && query.getString("password") != ""){
                    System.out.println("Exito usuairo y password correcto");
                    new tools().setVisible(true);
                    this.view.dispose();
                } else {
                    System.out.println("Error usuario o contraseña mal");
                }  } catch (SQLException ex) {
               System.out.println("error");
            }
      
        } else  { System.exit(0); }
    }
}
