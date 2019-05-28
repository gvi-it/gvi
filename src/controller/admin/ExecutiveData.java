package controller.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import libraries.FormV;
import libraries.Logo;
import libraries.Placeholder;
import view.form.admin.addExecutive;

public class ExecutiveData implements ActionListener {
    
addExecutive model = new addExecutive();    
FormV form = new FormV(model.getContentPane());  

    ExecutiveData (int id) {
    
    config(model);    
    
    model.cancel.addActionListener(this);
        
    }

    ExecutiveData () {
        model.cancel.addActionListener(this);
    config(model);    
    }

    private void config(addExecutive window) {
           
    window.setSize(window.getPreferredSize());
              
    window.setTitle("Datos Del Ejecutivo - ");
      
    window.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            
    window.setResizable(false);
    
    window.setIconImage(new Logo().createIcon());
    
    window.date.setFormatterFactory(new javax.swing.JFormattedTextField.AbstractFormatterFactory() {
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
    );
    
 
    
    
    new Placeholder("example@gerenciavirtual.net",window.email);
    new Placeholder("Your Name",window.name);
    new Placeholder("Your Lastname",window.lastname);
    new Placeholder("200.00",window.salary);
    new Placeholder("dd/mm/yyyy",window.date);
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
            
        } else if(e.getSource().equals(model.cancel)){
            
            if(form.validate()){
                         model.dispose();
             System.out.println("todo bien");
        } else {
            System.out.println("falta");
        }

        }
        
    }
}
