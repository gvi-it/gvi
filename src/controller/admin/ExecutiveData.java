package controller.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import libraries.FormV;
import libraries.Logo;
import libraries.Placeholder;
import view.form.admin.addExecutive;

public class ExecutiveData implements ActionListener, KeyListener {
    
addExecutive model = new addExecutive();    
FormV form = new FormV(model.getContentPane());  

    ExecutiveData (int id) {
    
    config(model);    
   
                                      
    }

    ExecutiveData () {
        
    config(model);     
            
    }

    private void config(addExecutive window) {
           
    window.setSize(window.getPreferredSize());
              
    window.setTitle("Datos Del Ejecutivo - ");
      
    window.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            
    window.setResizable(false);
    
    window.setIconImage(new Logo().createIcon());
    
    model.cancel.addActionListener(this);
    model.Save.addActionListener(this);
    model.email.addKeyListener(this);
    model.hours.addKeyListener(this);
    model.name.addKeyListener(this);
    model.role.addKeyListener(this);
    model.salary.addKeyListener(this);
    model.password.addKeyListener(this);
    
   /* window.date.setFormatterFactory(new javax.swing.JFormattedTextField.AbstractFormatterFactory() {
        @Override
        public JFormattedTextField.AbstractFormatter getFormatter(JFormattedTextField tf) {

            try{
              
            return new javax.swing.text.MaskFormatter("##/##/####");
                
            } catch(java.text.ParseException e){
                e.printStackTrace();
            }
            return null;
        }
    }
    );*/
    
    new Placeholder("example@gerenciavirtual.net",window.email);
    new Placeholder("Your Name",window.name);
    new Placeholder("Your Lastname",window.lastname);
    new Placeholder("200.00",window.salary);
  //  new Placeholder("dd/mm/yyyy",window.date);
//    new Placeholder("8",(JTextField) window.hours);
    
    System.out.println("Nombre de Jtext: "+window.salary.getAccessibleContext().getAccessibleDescription());
            
    window.setLocationRelativeTo(null);
            
        window.addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {

                //view.menu.admin.personal.setEnabled(true);
                super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
            }
        });
          
    window.setVisible(true);    
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
       
        if(e.getSource().equals(model.Save)){
             save();   
        } else if(e.getSource().equals(model.cancel)){
            
       this.model.dispose();

        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        System.out.println("key: "+e.getKeyCode());
            if(e.getKeyCode() == 10){
            
       
            e.getComponent().nextFocus();
            save();
            }
        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void save() {
       
     if(form.validate()){
                         model.dispose();
             System.out.println("todo bien");
        } else {
            System.out.println("falta");
        }    
        
    }
}
