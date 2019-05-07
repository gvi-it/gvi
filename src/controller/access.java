package controller;

//import model.*;
import hibernate.*;
import view.*;
import libraries.Logo;
import libraries.FormV;
import libraries.Session;
import libraries.Placeholder;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.digest.DigestUtils;

public class access implements ActionListener, KeyListener{    
    
    login view = new login();
    Executive model = new Executive();
    Role role = new Role();
    FormV form = new FormV(this.view.getContentPane());
    Session session = new Session();
    
    public access(){
   
    this.view.password.setText(session.data().get(this.view.email.getText()));
        
    this.view.btn.addActionListener(this);    
    this.view.close.addActionListener(this);
    this.view.passinfo.addActionListener(this);
    this.view.password.addKeyListener(this);
    this.view.email.addKeyListener(this);
    
    this.config();         
    }
  
    public void execute(){
    this.view.setVisible(true);
    this.view.setLocationRelativeTo(null);
    }
    
    private void config(){
        
    new Logo(this.view);
 
    this.view.setTitle("Gerencia Virtual - Login");
    this.view.getContentPane().setBackground(new java.awt.Color(0,87,166));
    this.view.setShape(new RoundRectangle2D.Double(0, 0, this.view.getWidth(),this.view.getHeight(), 30, 30));
    this.view.password.setEchoChar('*');    
    new Placeholder("customerservice@gerenciavirtual.net",this.view.email);  
    new Placeholder("************",this.view.password);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
  
        if(e.getSource().equals(view.btn)) {
           
        login(this.view.email.getText().toString(),this.view.password.getText().toString());
            
        } else if(e.getSource().equals(this.view.passinfo)){ 
                
                if(this.view.password.getEchoChar() == '*'){
                    this.view.password.setEchoChar((char)0);
                    System.out.println("Mostrar");
                } else {
                    this.view.password.setEchoChar('*');
                    System.out.println("Oculto");
                }
            
        } else { System.exit(0); }
    }

    @Override
    public void keyTyped(KeyEvent e) {
      
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
     
        if(e.getKeyCode() == 10){
        login(this.view.email.getText().toString(),this.view.password.getText().toString());    
        }   
    }

    @Override
    public void keyReleased(KeyEvent e) {
         
        if(e.getSource().equals(this.view.email) && session.exist(this.view.email.getText())){
               try{
                   this.view.password.setText(session.data().get(this.view.email.getText()));
//                    System.out.println(session.data().get(this.view.email.getText()));
                  //  login(this.view.email.getText(),session.data().get(this.view.email.getText()));
                    
               } catch(Exception es){ System.out.println(es); }
        } else {
            System.out.println("no");
        }
            
    }
    
    private void check(String k,String v){
        this.view.email.setText(k);
        this.view.password.setText(v);
        this.login(k, v);
    }
    
    public void checkSession(){
        
        if(session.exist()){
            
        
        
        session.data().forEach((k,v) -> this.check(k,v));
        
        } else {
            this.execute();
        }
       
       // this.view.dispose();
       // this.login(email, password);

      //  this.view.dispose();
    }

    private void login(String user, String password) {
        
        
        
        if(form.validate()){
            
            String encript = DigestUtils.sha512Hex(password); 
            
            System.out.println(encript);
                  
            try {          
            //conexion               
            Connect_DB vgi =  new Connect_DB();

            ResultSet query = vgi.execute("select * from executive inner join role on role.id = executive.role and executive.email = '"+user+"' and executive.password = '"+encript+"'");

            //model = new executive(query.getInt("id"),query.getString("name"),query.getString("lastname"),query.getString("ext"),query.getString("email"),query.getString("password"),query.getInt("erole"));                

            if(query.next()) {

            System.out.println("Exito usuairo y password correcto");

            new Session(user,password);
            
            role.setId(query.getInt("executive.role"));
            role.setName(query.getString("role.name"));
            
            
            Set<Executive> list = new HashSet();
            
         /*   Role r = new Role(query.getString("executive.name"),muser);
                      */  
           

   /*         model.setId(query.getInt("executive.id"));
            model.setName(query.getString("executive.name"));
            model.setLastname(query.getString("executive.lastname"));
            model.setEmail(query.getString("executive.email"));
            model.setPassword(query.getString("executive.password"));
            model.setRole(role);
            model.setListExecutives(model);*/
   
   
            model = new Executive(role,query.getString("executive.name"),query.getString("executive.lastname"),query.getString("executive.email"),query.getString("executive.password"),query.getFloat("executive.salary"),query.getInt("executive.hours"));                

            model.setId(query.getInt("executive.id"));
            model.setListExecutives(model);
   
       
           
//            model.setRoleName(query.getString("role.role"));
            
            System.out.println(model.getListExecutives());

            this.view.dispose();
            new cpanel(model.getListExecutives());

            } else {
            JOptionPane.showMessageDialog(null,"User or Password Incorrect");
            }  } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Server NOT FOUND");
            System.out.println(ex);
            }
        
        } else { JOptionPane.showMessageDialog(null,"Los campos son requeridos"); }
    } 
}