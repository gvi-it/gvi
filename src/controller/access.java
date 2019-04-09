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
import java.awt.geom.RoundRectangle2D;

public class access implements ActionListener{    
    
    login view = new login();
    executive model = new executive();
    FormV form = new FormV(this.view.getContentPane());
    
    int ban;
    
    public access(){
        
    this.view.btn.addActionListener(this);    
    this.view.close.addActionListener(this);
    this.view.passinfo.addActionListener(this);
    
    //this.view.email.setText("itdepartment@gerenciavirtual.net");
    //this.view.password.setText("123");
    
    this.config();      
    }
  
    public void execute(){
    this.view.setVisible(true);
    this.view.setLocationRelativeTo(null);
    }
    
    private void config(){
    this.view.getContentPane().setBackground(new Color(0.15f, 0.45f, 0.68f, 1));
    this.view.setShape(new RoundRectangle2D.Double(0, 0, this.view.getWidth(),this.view.getHeight(), 30, 30));
    this.view.password.setEchoChar('*');    
    new Placeholder("customerservice@gerenciavirtual.net",this.view.email);  
    new Placeholder("************",this.view.password);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
  
        if(e.getSource().equals(view.btn)) {
           
            if(form.validate()){
                
                 try {          
                //conexion               
                Connect_DB vgi =  new Connect_DB();
                
                ResultSet query = vgi.execute("SELECT * FROM executive WHERE email ='"+this.view.email.getText().toString()+"' and password ='"+this.view.password.getText().toString()+"'");
                
                //model = new executive(query.getInt("id"),query.getString("name"),query.getString("lastname"),query.getString("ext"),query.getString("email"),query.getString("password"),query.getInt("erole"));                
                
                if(query.next()) {
                
                System.out.println("Exito usuairo y password correcto");
                    
                model.setId(query.getInt("id"));
                model.setName(query.getString("name"));
                model.setLastname(query.getString("lastname"));
                model.setEmail(query.getString("email"));
                model.setPassword(query.getString("password"));
                model.setErole(query.getInt("erole"));
                  
                new cpanel(model);
                
                this.view.dispose();
                
                } else {
                JOptionPane.showMessageDialog(null,"User or Password Incorrect");
                }  } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Server NOT FOUND");
                System.out.println("error");
                }
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
}