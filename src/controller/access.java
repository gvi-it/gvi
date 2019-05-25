package controller;

//import model.*;
import hibernate.*;
import view.*;
import libraries.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import org.apache.commons.codec.digest.DigestUtils;

public class access implements ActionListener, KeyListener{    
    
    login view = new login();
    Executive model = new Executive();
    Role role = new Role();
    FormV form = new FormV(this.view.getContentPane());
    AccountSession session = new AccountSession();
    String inputLine = "";
    
    
    public access(){
        
                    try{
  
  JFrame.setDefaultLookAndFeelDecorated(true);
  JDialog.setDefaultLookAndFeelDecorated(true);
  UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
  //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
  //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
  //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
}
catch (Exception e)
 {
  e.printStackTrace();
 }
   
    if(AccountSession.File.exists()){    
    this.view.password.setText(session.data().get(this.view.email.getText()));
    }
    
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

    this.view.setIconImage(new Logo().createIcon());
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
           
        login(this.view.email.getText(),this.view.password.getText());
            
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
     
    }

    @Override
    public void keyPressed(KeyEvent e) {
     
        if(e.getKeyCode() == 10){    
            login(this.view.email.getText(),this.view.password.getText());
        } else {
        }   
    }

    @Override
    public void keyReleased(KeyEvent e) {
                 
    }
    
    private void check(String k,String v){
        this.view.email.setText(k);
        this.view.password.setText(v);
        this.login(k, v);
    }
    
    public void checkSession(){
        
        if(AccountSession.File.exists()){
         System.out.println("Existe la sesion");
        session.data().forEach((k,v) -> this.check(k,v));
        
        } else {
            this.execute();
        }
    }

    private void login(String user, String password) {
          
        if(form.validate()){
            
            String encript = DigestUtils.sha512Hex(password); 
            
            System.out.println(encript);
                  
            try {          
            //conexion               
            DataBase vgi =  new DataBase();

            ResultSet query = vgi.execute("select * from executive inner join role on role.id = executive.role and executive.email = '"+user+"' and executive.password = '"+encript+"'");

            //model = new executive(query.getInt("id"),query.getString("name"),query.getString("lastname"),query.getString("ext"),query.getString("email"),query.getString("password"),query.getInt("erole"));                

            if(query.next()) {

            System.out.println("Exito usuairo y password correcto");
            
            new AccountSession(user,password);
            
            role.setId(query.getInt("executive.role"));
            role.setName(query.getString("role.name"));
             
           // Set<Executive> list = new HashSet();
            
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
   
            DateFormat date = new DateFormat();
            
     //         BufferedReader in;
              
              
/*                try {
                    
                    URL oracle = new URL("https://www.gerenciavirtual.net/index.php/message?user="+model.getName()+"&&date="+date.getDate()+"&&hour="+date.getTime());
            
            
                  
                    
                    in = new BufferedReader(
                            new InputStreamReader(oracle.openStream()));
                    
                    String tmp; 
                    
                    while ((tmp = in.readLine()) != null){
                           inputLine+=tmp;
                    }
                    
                     in.close();
                    
                } catch (IOException ex) {
                    Logger.getLogger(access.class.getName()).log(Level.SEVERE, null, ex);
                }*/
                    
                     
               
   
                    System.out.println(inputLine);
           
            
            //new Gmail(user,"Inicio de Sesión",model.getName()+" "+model.getLastname()+" inicio sesión el "+date.getDate()+" a las "+date.getTime());

//            new Gmail("julioyoza@gerenciavirtual.net","Inicio de Sesión",model.getName()+" "+model.getLastname()+" inicio sesión el "+date.getDate()+" a las "+date.getTime());
  //          new Gmail("fmunoz@gerenciavirtual.net","Inicio de Sesión",model.getName()+" "+model.getLastname()+" inicio sesión el "+date.getDate()+" a las "+date.getTime());
            
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