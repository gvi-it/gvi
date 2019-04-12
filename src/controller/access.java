package controller;

import java.awt.Color;
import model.*;
import view.*;
import libraries.FormV;
import libraries.Placeholder;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import libraries.Session;

public class access implements ActionListener, KeyListener{    
    
    login view = new login();
    executive model = new executive();
    FormV form = new FormV(this.view.getContentPane());
    String[] data; 
    Session session = new Session();
    
    int ban;
    
    public access(){
        
    this.view.btn.addActionListener(this);    
    this.view.close.addActionListener(this);
    this.view.passinfo.addActionListener(this);
    this.view.email.addKeyListener(this);
    
    //this.view.email.setText("itdepartment@gerenciavirtual.net");
    //this.view.password.setText("123");
    
    this.config();      
    }
  
    public void execute(){
    this.view.setVisible(true);
    this.view.setLocationRelativeTo(null);
    }
    
    private void config(){
   // this.view.getContentPane().setBackground(new Color(0.15f, 0.45f, 0.68f, 1));
       this.view.getContentPane().setBackground(new java.awt.Color(0,87,166));
    this.view.setShape(new RoundRectangle2D.Double(0, 0, this.view.getWidth(),this.view.getHeight(), 30, 30));
    this.view.password.setEchoChar('*');    
    new Placeholder("customerservice@gerenciavirtual.net",this.view.email);  
    new Placeholder("************",this.view.password);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
  
        if(e.getSource().equals(view.btn)) {
           
            if(form.validate()){
                
                login(this.view.email.getText().toString(),this.view.password.getText().toString());
                
            } else {
                JOptionPane.showMessageDialog(null,"Los campos son requeridos");
            }
        } else if(e.getSource().equals(this.view.passinfo)){ 
                
                ban++;
                if(ban%2 == 0){
                ban = 0;
                this.view.password.setEchoChar('*');
                } else {
                this.view.password.setEchoChar((char)0);
                }
            
        } else { System.exit(0); }
    }

    @Override
    public void keyTyped(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
    
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
         if(session.exist(this.view.email.getText())){
               try{
                   this.view.password.setText(session.data().get(this.view.email.getText()));
//                    System.out.println(session.data().get(this.view.email.getText()));
                  //  login(this.view.email.getText(),session.data().get(this.view.email.getText()));
                    
               } catch(Exception es){ System.out.println(es); }
        } else {
            System.out.println("no");
        }
            
    }

    private void login(String user, String password) {
       
        try {          
        //conexion               
        Connect_DB vgi =  new Connect_DB();
                
        ResultSet query = vgi.execute("SELECT * FROM executive WHERE email ='"+user+"' and password ='"+password+"'");
                
        //model = new executive(query.getInt("id"),query.getString("name"),query.getString("lastname"),query.getString("ext"),query.getString("email"),query.getString("password"),query.getInt("erole"));                
                
        if(query.next()) {
                
        System.out.println("Exito usuairo y password correcto");
        
        new Session(user,password);
                    
        model.setId(query.getInt("id"));
        model.setName(query.getString("name"));
        model.setLastname(query.getString("lastname"));
        model.setEmail(query.getString("email"));
        model.setPassword(query.getString("password"));
        model.setErole(query.getInt("erole"));
       
        this.view.dispose();
        new cpanel(model);
        
        } else {
        JOptionPane.showMessageDialog(null,"User or Password Incorrect");
        }  } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Server NOT FOUND");
        System.out.println("error");
        }
    }
}