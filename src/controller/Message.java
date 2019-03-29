/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import model.message;
import view.helloworld;

/**
 *
 * @author Preinstalleduser
 */
public class Message implements ActionListener{    
    
    helloworld view = new helloworld();
    message model = new message();
    
    public Message(){
        
    this.view = view;
    this.model = model;
    
    view.btn.addActionListener(this);
    view.nord.addActionListener(this);
    view.message.setText(model.getmessage());
        
    }
    
    public void show(){
    this.view.setVisible(true);
    this.view.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
  
        if(e.getSource().equals(view.btn))
        System.out.println("btn");

    }

//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
