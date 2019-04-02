/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import librerias.Placeholder;
import model.*;
import view.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 *
 * @author Preinstalleduser
 */
public class acess implements ActionListener{    
    
    login view = new login();
    message model = new message();
    
    public acess(){
        
    this.view = view;
    this.model = model;
    
    this.view.close.setOpaque(true);
    this.view.close.setIcon(new ImageIcon("C:\\Users\\Preinstalleduser\\Downloads\\close.png"));
    this.view.close.addActionListener(this);
    
   // this.config();
   
   // view.btn.addActionListener(this);
        
    }
    
    public void show(){
    this.view.setVisible(true);
    this.view.setLocationRelativeTo(null);
    }
    
   /* private void config(){
    new Placeholder("customerservice@gerenciavirtual.net",this.view.user);  
    new Placeholder("************",this.view.password);
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
  
     /*   if(e.getSource().equals(view.btn)){
     //   System.out.println("btn");
        //conexion
         Connect_DB vgi =  new Connect_DB();
         
         vgi.execute();
      
        }*/
      System.exit(0);

    }

//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
