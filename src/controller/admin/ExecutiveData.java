package controller.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import libraries.Logo;
import libraries.Placeholder;
import view.form.admin.addExecutive;

public class ExecutiveData implements ActionListener{
    
addExecutive model = new addExecutive();    
  
    ExecutiveData (int id) {
    
    config(model);    
    
    model.cancel.addActionListener(this);
        
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
    
    new Placeholder("example@gerenciavirtual.net",window.email);
        new Placeholder("Your Name",window.name);
            new Placeholder("Your Lastname",window.lastname);
                new Placeholder("200.00",window.salary);
                    new Placeholder("8",window.hours);
            
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
            model.dispose();
        }
        
    }
}
