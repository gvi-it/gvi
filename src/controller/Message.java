/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import librerias.Placeholder;
import model.*;
import view.*;

/**
 *
 * @author Preinstalleduser
 */
public class Message implements ActionListener{    
    
    login view = new login();
    message model = new message();
    
    public Message(){
        
    this.view = view;
    this.model = model;
    
    this.config();
    
    view.btn.addActionListener(this);
        
    }
    
    public void show(){
    this.view.setVisible(true);
    this.view.setLocationRelativeTo(null);
    }
    
    private void config(){
    new Placeholder("customerservice@gerenciavirtual.net",this.view.user);  
    new Placeholder("************",this.view.password);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
  
        if(e.getSource().equals(view.btn))
        System.out.println("btn");

    }

//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
