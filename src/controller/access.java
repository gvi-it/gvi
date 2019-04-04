package controller;

import model.*;
import view.*;
import libraries.FormV;
import libraries.Placeholder;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class access implements ActionListener{    
    
    login view = new login();
    FormV form = new FormV(view.getContentPane());
    executive model;
    
    public access(){
             
    this.view.close.addActionListener(this);
    this.view.btn.addActionListener(this);
    
    this.config();
        
    }
    
    public void execute(){
    this.view.setVisible(true);
    this.view.setLocationRelativeTo(null);
    }
    
    private void config(){
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
                
                query.next();
                
                if(query.getString("email") != "" && query.getString("password") != "") {
                    System.out.println("Exito usuairo y password correcto");
                    new tools().setVisible(true);
                    this.view.dispose();
                } else {
                    System.out.println("Error usuario o contraseña mal");
                }  } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"User or Password Incorrect");
                System.out.println("error");
                }
            } else {
                JOptionPane.showMessageDialog(null,"Los campos son requeridos");
            }
        } else  { System.exit(0); }
    }
}
